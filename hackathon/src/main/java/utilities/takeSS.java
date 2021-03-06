package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import baseClasses.BaseClass;


public class takeSS extends BaseClass {
	
	public static void captureScreenShot(WebDriver driver, String ssName) throws IOException { //method to take screenshot with the name as from second argument 'ssName'
		TakesScreenshot ts=(TakesScreenshot)driver;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("./screenshot/"+ssName+".png"));//this will give the screen shot name as per our convenience
	}
}
