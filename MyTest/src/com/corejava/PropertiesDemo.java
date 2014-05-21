package com.corejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties prop = new Properties();

		// add some properties
		prop.put("Height", "200");
		prop.put("Width", "15");
		prop.put("Age", "25");
		prop=System.getProperties();
		for(Entry<Object, Object> map:prop.entrySet()){
			System.out.println(map.getKey()+"System "+map.getValue());
		}

		try {

			// create a output and input as a xml file
			FileOutputStream fos = new FileOutputStream("properties.xml");
			FileInputStream fis = new FileInputStream("properties.xml");

			// store the properties in the specific xml
			prop.storeToXML(fos, "Properties Example");

			// load from the xml that we saved earlier
			// prop.loadFromXML(fis);

			// print the properties list
			// prop.list(System.out);

			while (fis.available() > 0) {
				System.out.print("" + (char) fis.read());
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}
