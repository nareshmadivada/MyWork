/**
 * 
 */
package com.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * @author Naresh
 * 
 */
public class XmlToObject {

	public static void main(String[] args) {
		try {
			File file = new File("employee.xml");
			JAXBContext context = JAXBContext.newInstance(Employee.class);
			Unmarshaller unmar = context.createUnmarshaller();
			Employee emp = (Employee) unmar.unmarshal(file);
			System.out.println("Id: "+emp.getId()+ " Name: "+emp.getName() + " Salary: " + emp.getSalary());

		} catch (JAXBException e) {
			e.printStackTrace();

		}

	}

}
