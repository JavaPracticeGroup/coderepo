import java.io.OutputStream;
import java.io.PrintStream;
import com.experiment.abhijit.AbhijitExperiment;
import com.experiment.packages.Experiment;
import com.experiment.packages.Tag;
import com.experiment.vivek.VivekExperiment;
import com.system.application.*;

import org.apache.log4j.BasicConfigurator;

/**
 * 
 * Don't Modify this code
 * 
 * @author Abhijit Kumar
 *
 */
public class HelloWorld {

	private class Interceptor extends PrintStream {
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

			String finalString = detailPrintLnData + s;
			String tagSplit="__: ";
			String[] strArr = s.split(tagSplit);
			
			boolean isDisplayAllowed=true;
			
			switch (strArr[0]+tagSplit) {
			case Tag.NOTE:
				finalString = "\n \033[36m " + finalString + "\033[30m ";
				break;
			case Tag.EXCEPT:
				finalString = "\n \033[35m " + finalString + "\033[30m ";
				break;
			case Tag.WARN:
				finalString = "\n \033[31m " + finalString + "\033[30m ";
				break;
			case Tag.IMPORTANT:
				finalString = "\n \033[34m " + finalString + "\033[30m ";
				break;
			case Tag.RULE:
				finalString = "\n \033[33m " + finalString + "\033[30m ";
				break;
			default:
				isDisplayAllowed=!AppConfig.isPrintTagOnly;
			}
			
			if(isDisplayAllowed) {
				super.println(finalString);	
			}
			
		}

	}

	/**
	 * Please don't add your logic here. Instead of you can try in Experiment class
	 * (just make sure Config.isExperimentEnabled is true) Else it will go through
	 * the indexes which we mentioned in index function of BOOK class.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String user = AppConfig.getUser();
		HelloWorld helloWorld = new HelloWorld();
		PrintStream origOut = System.out;
		PrintStream interceptor = helloWorld.new Interceptor(origOut);
		System.setOut(interceptor);
		BasicConfigurator.configure();
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
