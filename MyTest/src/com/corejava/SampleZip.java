package com.corejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class SampleZip {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		byte[] buffer = new byte[1024];
		FileOutputStream fos = new FileOutputStream("D:\\ioc.zip");
		ZipOutputStream zos = new ZipOutputStream(fos);
		ZipEntry ze = new ZipEntry("ioc.txt");
		zos.putNextEntry(ze);
		FileInputStream fis = new FileInputStream("D:\\ioc.txt");
		int len;
		while ((len = fis.read(buffer)) > 0) {
			zos.write(buffer, 0, len);

		}
		fis.close();
		zos.closeEntry();

		// remember close it
		zos.close();

		System.out.println("Done");

	}

}
