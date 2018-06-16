package com.system.application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.experiment.packages.Experiment;

public final class AppUtil  {
	public final static Logger logger = Logger.getLogger(Experiment.class);

	public static String getFileContent(String filePath, boolean supressPrintStack) {
		Scanner myScanner = null;
		String content = null;
		try {
			myScanner = new Scanner(new File(filePath));
			content = myScanner.useDelimiter("\\Z").next();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			if (!supressPrintStack) {
				e.printStackTrace();
			}
		} finally {
			myScanner.close();
		}

		return content;
	}

	public static void writeToFile(String fileAbsolutePath, String content) {
		BufferedWriter writer = null;
		try {

			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileAbsolutePath), "utf-8"));
			writer.write(content);

		} catch (IOException ex) {
			System.out.println(ex);
		} finally {
			try {
				writer.close();
			} catch (Exception ex) {
				/* ignore */}
		}
	}

	public static void lineBreak() {
		System.out.print("\n---------------------------------------------------------------------------------\n");
	}
	
	public static void functionBreak() {
		System.out.print("__________________________________________________________________________________\n\n");
	}

	public static void runMe(String parameter) {

		if (logger.isDebugEnabled()) {
			logger.debug("This is debug : " + parameter);
		}

		if (logger.isInfoEnabled()) {
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);

	}
}
