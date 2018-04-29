package testcases;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class CheckReport {
	
	public static void main(String[] args) {
		
		String fileName = "./reports/result.html";
		
		ExtentReports ex = new ExtentReports(fileName,false);
		ex.loadConfig(new File("./extent-config.xml"));

		ExtentTest test = ex.startTest("Test1");
		ex.endTest(test);
		ex.flush();
	}

}
