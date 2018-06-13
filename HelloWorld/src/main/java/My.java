
/**
 * 
 * Don't Modify this code
 * @author Abhijit Kumar
 *
 */
public class My {

	public static void println() {
		String className = Thread.currentThread().getStackTrace()[2].getClassName();
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		String filename = Thread.currentThread().getStackTrace()[2].getFileName();
		
		System.out.println(filename+""+className+""+methodName+""+"ok");
	}

}
