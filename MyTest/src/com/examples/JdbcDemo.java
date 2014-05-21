package com.examples;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class DetailsFrame extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField txtDeptno, txtDname, txtLoc;
	Button First, Next, Previous, Last;
	Button Insert, Update, Delete, Exit;
	Panel DisplayPanel, ButtonsPanel, MoveButtonsPanel, DMLButtonsPanel;

	Connection con;
	Statement InsertStmt, RetrieveStmt;
	ResultSet rs;

	DetailsFrame() {
		super("Dept Details");

		createComponents();

		prepareDB();

		getData();

		pack();
		setVisible(true);
	}

	public void getData() {
		try {
			txtDeptno.setText(rs.getString(1));
			txtDname.setText(rs.getString(2));
			txtLoc.setText(rs.getString(3));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void prepareDB() {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:demo", "scott",
					"tiger");

			RetrieveStmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);

			InsertStmt = con.createStatement();

			openRS();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void openRS() {
		try {
			rs = RetrieveStmt
					.executeQuery("select * from dept order by deptno");

			rs.next();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void createComponents() {
		DisplayPanel = new Panel();
		DisplayPanel.setLayout(new GridLayout(3, 2));

		txtDeptno = new TextField(20);
		txtDname = new TextField(20);
		txtLoc = new TextField(20);

		DisplayPanel.add(new Label("Deptno"));
		DisplayPanel.add(txtDeptno);

		DisplayPanel.add(new Label("Dname"));
		DisplayPanel.add(txtDname);

		DisplayPanel.add(new Label("Location"));
		DisplayPanel.add(txtLoc);

		ButtonsPanel = new Panel();
		ButtonsPanel.setLayout(new GridLayout(2, 1));

		MoveButtonsPanel = new Panel();

		First = new Button("|<");
		First.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				FirstRecord();
			}
		});

		Previous = new Button("<");

		Previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				PreviousRecord();
			}
		});

		Next = new Button(">");

		Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				NextRecord();
			}
		});

		Last = new Button(">|");
		Last.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				LastRecord();
			}
		});

		MoveButtonsPanel.add(First);
		MoveButtonsPanel.add(Previous);
		MoveButtonsPanel.add(Next);
		MoveButtonsPanel.add(Last);

		ButtonsPanel.add(MoveButtonsPanel);

		DMLButtonsPanel = new Panel();

		Insert = new Button("Insert");
		Insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (Insert.getLabel().equals("Insert"))
					insertRecord();
				else
					commitRecord();
			}
		});

		Update = new Button("Update");
		Delete = new Button("Delete");
		Exit = new Button("Exit");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (Exit.getLabel().equals("Exit"))
					exitApp();
				else
					rollbackRecord();
			}
		});

		DMLButtonsPanel.add(Insert);
		DMLButtonsPanel.add(Update);
		DMLButtonsPanel.add(Delete);
		DMLButtonsPanel.add(Exit);

		ButtonsPanel.add(DMLButtonsPanel);
		addComponents();
	}

	private void addComponents() {
		add(DisplayPanel);
		add(ButtonsPanel, BorderLayout.SOUTH);
	}

	public void FirstRecord() {
		try {
			rs.first();
			getData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void PreviousRecord() {
		try {
			rs.previous();

			if (rs.isBeforeFirst())
				rs.last();

			getData();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void NextRecord() {
		try {
			rs.next();

			if (rs.isAfterLast())
				rs.first();

			getData();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void LastRecord() {
		try {
			rs.last();
			getData();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void insertRecord() {
		clearComponents();
		txtDeptno.requestFocus();
		try {
			con.setAutoCommit(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Insert.setLabel("Commit");
		Exit.setLabel("Cancel");
	}

	public void clearComponents() {
		txtDeptno.setText("");
		txtDname.setText("");
		txtLoc.setText("");
	}

	public void commitRecord() {
		String InsertStr = "Insert into dept values(" + txtDeptno.getText()
				+ ",'" + txtDname.getText() + "','" + txtLoc.getText() + "')";

		try {
			InsertStmt.executeUpdate(InsertStr);

			con.commit();
			con.setAutoCommit(true);

			Insert.setLabel("Insert");
			Exit.setLabel("Exit");

			openRS();
			FirstRecord();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void exitApp() {
		System.exit(0);
	}

	private void rollbackRecord() {
		try {
			con.rollback();
			con.setAutoCommit(true);

			Insert.setLabel("Insert");
			Exit.setLabel("Exit");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class JdbcDemo {
	public static void main(String args[]) {
		new DetailsFrame();
	}
}