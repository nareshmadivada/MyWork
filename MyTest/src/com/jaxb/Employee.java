/**
 * 
 */
package com.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Naresh
 * 
 */

@XmlRootElement
public class Employee {
	private int id;
	private String name;
	private float salary;

	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}

}
