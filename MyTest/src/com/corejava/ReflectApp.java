package com.corejava;

import java.lang.reflect.Method;

public class ReflectApp {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// no paramater
		Class[] noParams = {};
		// String parameter
		Class[] paramString = new Class[1];
		paramString[0] = String.class;
		// int parameter
		Class[] paramInt = new Class[1];
		paramInt[0] = Integer.TYPE;
		try {
			// load the AppTest at runtime
			Class<?> c = Class.forName("com.corejava.TestApp");
			Object obj = c.newInstance();

			// call the printIt method
			Method method = c.getDeclaredMethod("printIt", noParams);
			method.invoke(obj, null);

			// call the printItString method, pass a String param
			method = c.getDeclaredMethod("printString", paramString);
			method.invoke(obj, new String("MNB"));

			// call the printItInt method, pass a int param
			method = c.getDeclaredMethod("printInt", paramInt);
			method.invoke(obj, 123);

			// call the setCounter method, pass a int param
			method = c.getDeclaredMethod("setCounter", paramInt);
			method.invoke(obj, 30);
			// call the printCounter method
			method = c.getDeclaredMethod("printConuter", noParams);
			method.invoke(obj, null);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
