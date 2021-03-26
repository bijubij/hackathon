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

public class allTestCases extends BaseClass {

	@Test(groups= {"testCase"})
	public void login()
	{
		invokeBrowser();
		openApplication();
		try {
			clickLogin.login();
			takeSS.captureScreenShot(driver, "loginSS");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
	}
	
	@Test(groups= {"testCase"})
	public void searchUpcomingBikes()
	{
		invokeBrowser();
		openApplication();
		Landingpage.clickNewBikes();
		try {
			takeSS.captureScreenShot(driver, "hondaBikes");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Upcoming.findHonda();
		Filter.fil();
		close();
	}
	
	@Test(groups= {"testCase"})
	public void searchUsedCars()
	{
		invokeBrowser();
		openApplication();
		chennai.clickChennai();
		try {
			takeSS.captureScreenShot(driver, "chennaiCars");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cars.getCars();
		cars.showCars();
		close();
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
}

