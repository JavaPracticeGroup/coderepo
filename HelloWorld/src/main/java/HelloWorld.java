import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

import org.json.JSONObject;


/**
 * 
 * @author Abhijit Kumar
 *
 */
final class AppUtil {

	public static String getFileContent(String filePath) {
		Scanner myScanner = null;
		String content = null;
		try {
			myScanner = new Scanner(new File(filePath));
			content = myScanner.useDelimiter("\\Z").next();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
}

/**
 * 
 * @author Abhijit Kumar
 *`
 */
final class AppConfig {
	private final static String root;
	private final static String allowedDeletePathRoot;
	private final static String dataLib;
	private static boolean isDebugEnbld = false;
	public final static boolean isDetailPrintLnEnabled = true;
	public final static boolean isExperimentEnabled = false;
	
	static {
		String appConfigStr = null;
		try {
			appConfigStr = AppUtil.getFileContent("AppConfig.json");
		} catch (Exception e) {
			appConfigStr = "{}";
			System.out.println(e.getMessage());
		}

		String tRoot = null, tAllowedDeletePathRoot = null, tDataLib = null;
		try {
			JSONObject appConf = new JSONObject(appConfigStr);
			tRoot = appConf.getString("ROOT_PATH");
			tAllowedDeletePathRoot = appConf.getString("ROOT_PATH");
			tDataLib = appConf.getString("DATA_PATH");
			isDebugEnbld = appConf.optBoolean("DEBUG");
		} catch (Exception e) {
			tRoot = null;
			tAllowedDeletePathRoot = null;
			tDataLib = null;
			isDebugEnbld = false;
		} finally {
			root = tRoot;
			allowedDeletePathRoot = tAllowedDeletePathRoot;
			dataLib = tDataLib;
		}
	}
	
	public static String getRoot(String path) {
		return root + path;
	}
}

/**
 * 
 * Don't Modify this code
 * 
 * @author Abhijit Kumar
 *
 */
public class HelloWorld {

	/**
	 * Please don't add your logic here. Instead of you can try in Experiment class
	 * (just make sure Config.isExperimentEnabled is true) Else it will go through the
	 * indexes which we mentioned in index function of BOOK class.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PrintStream origOut = System.out;
		PrintStream interceptor = new Interceptor(origOut);
		System.setOut(interceptor);
		if (!AppConfig.isExperimentEnabled) {
			Book book = new Book();
			book.index();
		} else {
			Experiment experiment = new Experiment();
			experiment.start();
		}
	}

}


class Interceptor extends PrintStream {
	public Interceptor(OutputStream out) {
		super(out, true);
	}

	@Override
	public void println(String s) {
		boolean isFileNameVisiabled = false, isClassNameVisiabled = true, isMethodNameVisiabled = true;

		String className = (AppConfig.isDetailPrintLnEnabled && isClassNameVisiabled)
				? Thread.currentThread().getStackTrace()[2].getClassName() + " :: "
				: "";
		String methodName = (AppConfig.isDetailPrintLnEnabled && isMethodNameVisiabled)
				? Thread.currentThread().getStackTrace()[2].getMethodName() + " "
				: "";
		String filename = (AppConfig.isDetailPrintLnEnabled && isFileNameVisiabled)
				? Thread.currentThread().getStackTrace()[2].getFileName() + " "
				: "";
		String detailPrintLnData = "";
		if (AppConfig.isDetailPrintLnEnabled) {
			detailPrintLnData = filename + className + methodName + " --- ";
		}
		super.println(detailPrintLnData+s);
	}
}

