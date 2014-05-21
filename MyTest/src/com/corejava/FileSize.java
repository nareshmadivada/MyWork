package com.corejava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;

public class FileSize {

	/**
	 * @param args
	 */
	 static public  void  main(String[] args) throws IOException {
		File sfile = new File("D:\\links.txt");
		File dfile = new File("D:\\Files\\B\\ioc.txt");
		InputStream is = new FileInputStream(sfile);
		OutputStream os = new FileOutputStream(dfile);
		byte[] buffer = new byte[1024];
		int len;
		while ((len = is.read(buffer)) > 0) {
			os.write(buffer, 0, len);

		}
		is.close();
		os.close();
		// sfile.delete();
		System.out.println("File Copied");
		/*
		 * if(file.renameTo(new File("D:\\Files\\A\\ioc"))){
		 * System.out.println("File is moved"); }else{
		 * System.out.println("Failed to move"); }
		 */
		if (sfile.exists()) {
			String data = "Added Text";
			FileWriter fileWritter = new FileWriter(sfile.getName(), true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.write(data);
			bufferWritter.close();

			System.out.println("Append Done");

			double bytes = sfile.length();
			double kb = (bytes / 1024);
			double mb = (kb / 1024);
			double gb = (mb / 1024);
			double tb = (gb / 1024);
			double pb = (tb / 1024);
			double eb = (pb / 1024);
			double zb = (eb / 1024);
			double yb = (zb / 1024);

			System.out.println("KiloBytes " + kb);
			System.out.println("MegaBytes " + mb);
			System.out.println("GigaBytes " + gb);
			System.out.println("TeraBytes " + tb);
			System.out.println("PetaBytes " + pb);
			System.out.println("ExaBytes " + eb);
			System.out.println("ZettaBytes " + zb);
			System.out.println("YottaBytes " + yb);

			// print the original last modified date
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Original Last Modified Date : "
					+ sdf.format(sfile.lastModified()));

		} else {
			System.out.println("File doesn't exists!");
		}

	}

}
