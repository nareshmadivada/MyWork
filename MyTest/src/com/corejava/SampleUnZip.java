package com.corejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class SampleUnZip {

	/**
	 * @param args
	 */

	private static final String INPUT_ZIP_FILE = "D:\\ioc.zip";
	private static final String OUTPUT_FOLDER = "D:\\outputzip";

	public static void main(String[] args) throws IOException {
		SampleUnZip suz = new SampleUnZip();
		suz.UnZipIt(INPUT_ZIP_FILE, OUTPUT_FOLDER);

	}

	public void UnZipIt(String zipFile, String outputFolder) throws IOException {
		byte[] buffer = new byte[1024];
		File file = new File(outputFolder);
		if (!file.exists()) {
			file.mkdir();
		}
		// get the zip file content
		ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile));
		// get the zipped file list entry
		ZipEntry ze = zis.getNextEntry();
		while (ze != null) {
			String fileName = ze.getName();
			File newFile = new File(outputFolder + File.separator + fileName);
			System.out.println("file unzip : " + newFile.getAbsoluteFile());
			// create all non exists folders
			// else you will hit FileNotFoundException for compressed folder
			new File(newFile.getParent()).mkdirs();

			FileOutputStream fos = new FileOutputStream(newFile);

			int len;
			while ((len = zis.read(buffer)) > 0) {
				fos.write(buffer, 0, len);
			}

			fos.close();
			ze = zis.getNextEntry();
		}

		zis.closeEntry();
		zis.close();

		System.out.println("Done");
	}

}
