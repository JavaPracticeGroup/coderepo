import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;
import com.experiment.abhijit.AbhijitExperiment;
import com.experiment.vivek.VivekExperiment;

import org.json.JSONObject;

/**
 * 
 * @author Abhijit Kumar
 *
 */
final class AppUtil {

	public static String getFileContent(String filePath , boolean supressPrintStack) {
		Scanner myScanner = null;
		String content = null;
		try {
			myScanner = new Scanner(new File(filePath));
			content = myScanner.useDelimiter("\\Z").next();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			if(!supressPrintStack)
			{e.printStackTrace();
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
}

/**
 * 
 * @author Abhijit Kumar `
 */
class AppConfig {
	private final static String user;
	public final static boolean isDetailPrintLnEnabled = true;
	public final static boolean isExperimentEnabled = true;

	static {
		String appConfigStr = null;
		try {
			appConfigStr = AppUtil.getFileContent("AppConfig.json",true);
		} catch (Exception e) {
			appConfigStr = AppUtil.getFileContent("AppConfigCopy.json",true);
		}

		String tUser = null;
		try {
			JSONObject appConf = new JSONObject(appConfigStr);
			tUser = appConf.getString("USER_NAME");
		} catch (Exception e) {
			System.out.println("Error in AppConfig");
			System.exit(0);
		} finally {
			user = tUser;
		}
	}

	public static String getUser() {
		return user;
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
	 * (just make sure Config.isExperimentEnabled is true) Else it will go through
	 * the indexes which we mentioned in index function of BOOK class.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PrintStream origOut = System.out;
		PrintStream interceptor = new Interceptor(origOut);
		System.setOut(interceptor);
		String user = AppConfig.getUser();

		if (!AppConfig.isExperimentEnabled) {
			Book book = new Book();
			book.index();
		} else {
			switch (user) {
			case "Abhijit":
				AbhijitExperiment abhijitExperiment = new AbhijitExperiment();
				abhijitExperiment.start();
				break;

			case "Vivek":
				VivekExperiment vivekExperiment = new VivekExperiment();
				vivekExperiment.start();
				break;

			}

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
		super.println(detailPrintLnData + s);
	}
}
