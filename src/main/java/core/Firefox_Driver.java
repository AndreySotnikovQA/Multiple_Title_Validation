package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Driver {
	
	public static void main(String [] args) {

		//Run With out command line arguments
		if (args.length == 0){
			System.out.println("Warning: No arguments");
			System.exit(1);
		}
		WebDriver driver = new FirefoxDriver();    // Version 1.1 :: Firefox _multiple_args
		//String text_case_id = "TC-001.01";
		//String url = "https://www.youtube.com";
		//String title_expected = "YouTube";
		//String title_expected = "Wikipedia";
		
		for(byte i=0;i<args.length;i++){
		String text_case_id = "TC-001.0"+(i+1);
		String param[] = args[i].split("\\|");
		String url = param[0];
		String title_expected = param[1];
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String title_actual = driver.getTitle();

		if (title_expected.equals(title_actual)) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("URL: \t\t\t" + url);
			System.out.println("Title Expected: \t" + title_expected);
			System.out.println("Title Actual: \t\t" + title_actual);
			System.out.println("Test Case Result: \t" + "PASSED");
			System.out.println("--------------------------------------------------------------");
			System.out.println();
		} else {
			System.out.println("--------------------------------------------------------------");
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("URL: \t\t\t" + url);
			System.out.println("Title Expected: \t" + title_expected);
			System.out.println("Title Actual: \t\t" + title_actual);
			System.out.println("Test Case Result: \t" + "FAILED");
			System.out.println("--------------------------------------------------------------");
			System.out.println();
		}
		
		} 
		//Loop for
		
		driver.quit();
	}
}
