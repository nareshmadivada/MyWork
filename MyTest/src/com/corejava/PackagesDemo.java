package com.corejava;

public class PackagesDemo {

	/**
	 * @param args
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 */
	public static void main(String[] args) throws ClassNotFoundException,
			SecurityException, NoSuchFieldException {
		Class<?> cls = Class.forName("com.examples.Factorial");
		System.out.println("Class = " + cls.getName());
		System.out.println("Package = " + cls.getPackage());
		System.out.println(cls.getDeclaredField("fact"));
		Package pack = Package.getPackage("com.examples");
		System.out.println(pack.getName());

	}

}
