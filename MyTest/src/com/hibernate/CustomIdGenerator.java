/**
 * 
 */
package com.hibernate;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

/**
 * @author naresh
 * 
 */
public class CustomIdGenerator implements IdentifierGenerator {

	static int x = 10;
	static {
		x = 1234;
	}

	@Override
	public Serializable generate(SessionImplementor ses, Object obj)
			throws HibernateException {
		
		  Long raNo = (long) Math.random(); 
		 
		String prefix = "MNT";
		String genId = null;
		int id = 0;
		Connection con = ses.connection();
		/*
		 * PreparedStatement ps = con
		 * .prepareStatement("select id from countries"); ResultSet rs =
		 * ps.executeQuery(); while (rs.next()) { id = rs.getInt(1); }
		 */
		Integer radNo = (int) Math.random();
		genId = prefix + radNo;
		return genId;
	}

	public static void main(String[] args) {
		String prefix = "MNT";
		String genId = null;
		Random randomno = new Random();
		Integer radNo = (int) Math.random();
		System.out.println(randomno.nextInt());
		genId = prefix + randomno.nextInt();
		System.out.println('@' + ' ');
		// check next int value
		System.out.println("Next int value: " + genId);
	}

}
