package com.jasper;

import java.util.HashMap;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;

public class JasperTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String fileName = "D://LatestMNTLandScape.jasper";
		String outFileName = "D://testMNT.pdf";
		HashMap map = new HashMap();

		try {
			JasperPrint print = JasperFillManager.fillReport(fileName, map,
					new JREmptyDataSource());
			// Create a PDF exporter
			JRExporter exporter = new JRPdfExporter();

			// Configure the exporter (set output file name and print object)
			exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME,
					outFileName);
			exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);

			// Export the PDF file
			exporter.exportReport();

		} catch (JRException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

	}

}
