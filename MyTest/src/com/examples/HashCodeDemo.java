/**
 * 
 */
package com.examples;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author naresh
 * 
 */
public class HashCodeDemo {
	private int id = 10;
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = 10;
	}

	public void setName(String name) {
		this.name = name;
	}

	void display() {
		id = 30;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeDemo other = (HashCodeDemo) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HashCodeDemo [id=" + id + "]";
	}

	public static void main(String[] args) throws UnknownHostException {
		HashCodeDemo g = new HashCodeDemo();
		g.getId();
		System.out.println(InetAddress.getLocalHost());
		System.out.println(InetAddress.getByName("localhost"));

	}

}
