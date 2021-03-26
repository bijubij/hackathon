package testCases;
import java.io.IOException;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import baseClasses.BaseClass;
import pageClasses.Filter;
import pageClasses.Landingpage;
import pageClasses.Upcoming;
import pageClasses.cars;
import pageClasses.chennai;
import pageClasses.clickLogin;
import utilities.takeSS;

public class Login extends BaseClass {

	@Test(groups= {"testCase"}) //testcase to login using google-id
	public void login()
	{
		invokeBrowser(); //to invoke the browser
		openApplication(); //to get to the website
		try {
			clickLogin.login(); //method the click the Login
			takeSS.captureScreenShot(driver, "loginSS"); //to take screenshot with the name 'loginSS'
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
}
