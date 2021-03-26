package baseClasses;


import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pageClasses.Landingpage;


public class BaseClass {
	public static WebDriver driver;
	public String url;

	public void invokeBrowser() {   //method to invoke the browser
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver(); //setting the driver to invoke Chrome Browser
		Properties prop= new Properties();
		try {
			InputStream input= new FileInputStream("./configure.properties"); //to get data from properties file
			prop.load(input); 
			url=prop.getProperty("url"); //getting the url from properties file
		} catch (Exception e) { //if any exception occurs
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void openApplication() {
		driver.get(url); //opening the website of ZigWheels
		driver.manage().window().maximize(); //Maximizing the browser
		driver.manage().deleteAllCookies();
	}



}
