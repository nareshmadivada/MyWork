/**
 * 
 */
package com.jaxb;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * @author Naresh
 * 
 */
public class ObjectToXml {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(30);
		emp.setName("Naresh");
		emp.setSalary(10000);
		try {
			JAXBContext context = JAXBContext.newInstance(Employee.class);
			Marshaller mar = context.createMarshaller();
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			mar.marshal(emp, new FileOutputStream("employee.xml"));
			mar.marshal(emp, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
