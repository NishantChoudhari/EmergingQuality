package com.testingshastra.regressiontestcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import  com.testingshastra.keywords.Constant;
import  com.testingshastra.keywords.Keyword;

public class Sign_Up_page {

	// public static WebDriver driver;
	@BeforeTest
	public void tc_01() {

	Keyword.openBrowser("Chrome");
	Keyword.implicit_Wait(5, "SECONDS");

	Keyword.logger_add("Browser Opened");

	}

	@Test
	public void tc_02() throws IOException {
	Keyword.openURL("https://www.amazon.in/");
		String Actual = Constant.driver.getCurrentUrl();
//	Keyword.take_Screen_Shot("PNG","444");
	Keyword.captureScreenshot("Amazon", ".PNG");
	Keyword.implicit_Wait(5, "SECONDS");
		String Expected = "https://www.amazon.in/";
		System.out.println(Actual);
		Assert.assertEquals(Actual, Expected);
	Keyword.logger_add("URL Opened");
	}

	@Test
	public void tc_03() {
	Keyword.clickOnElement("XPATH", "//a[contains(text(),'Amazon Pay')]");
	Keyword.logger_add("URL Opened");
	}

	@Test
	public void tc_04() throws InterruptedException {

		Set<String> set = Constant.driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<String>(set);
	Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
		// Thread.sleep(2000);
		// Constant.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Keyword.implicit_Wait(5, "SECONDS");
		String Actual = Keyword
				.getWebElement("XPATH", "//span[contains(text(),'Your Transactions')]").getText();
		String Expected = "Your Transactions";
		Assert.assertEquals(Actual, Expected);
	Keyword.clickOnElement("XPATH", "//span[contains(text(),'Your Transactions')]");
	Keyword.logger_add("Click on Your Transactions");
	}

	@Test
	public void tc_05() throws InterruptedException {
		Set<String> set = Constant.driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<String>(set);
	Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
		// Thread.sleep(2000);
		// Constant.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Keyword.implicit_Wait(5, "SECONDS");

	Keyword.logger_add("Click on Create your Amazon account");
		String Actual = Keyword
				.getWebElement("XPATH", "//a[contains(text(),'Create your Amazon account')]").getText();
		String Expected = "Create your Amazon account";
		Assert.assertEquals(Actual, Expected);
	Keyword.clickOnElement("XPATH",
				"//a[contains(text(),'Create your Amazon account')]");
	}

	@Test
	public void tc_06() throws InterruptedException {
		Set<String> set = Constant.driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<String>(set);
	Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
		// Thread.sleep(2000);
		// Constant.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Keyword.implicit_Wait(5, "SECONDS");
	Keyword.enterText("XPATH", "//input[@name=\"customerName\"]", "Manisha");
	Keyword.logger_add("Entering the customerName");
//		String Actual=Keyword.getWebElement("XPATH", "//input[@name=\\\"customerName\\\"]").getText();
//		String Expected="Create your Amazon account";
//		Assert.assertEquals(Actual,Expected);
	}

	@Test
	public void tc_07() throws InterruptedException {
		Set<String> set = Constant.driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<String>(set);
	Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
		// Thread.sleep(2000);
		// Constant.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Keyword.implicit_Wait(5, "SECONDS");
	Keyword.enterText("XPATH", "//input[@id='ap_phone_number']", "8625974462");
	Keyword.logger_add("Entering the Phone Number");
	}

////	
	@Test
	public void tc_09() throws InterruptedException {
		Set<String> set = Constant.driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<String>(set);
	Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
		// Thread.sleep(2000);
		// Constant.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Keyword.implicit_Wait(5, "SECONDS");
	Keyword.enterText("XPATH", "//input[@type='password']", "manishankale23@gmail.com");
	Keyword.logger_add("Entering the Password ");
	}

	@Test
	public void tc_10() throws InterruptedException {
		Set<String> set = Constant.driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<String>(set);
	Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
		Thread.sleep(2000);

//		Thread.sleep(2000);
		// Constant.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Keyword.implicit_Wait(5, "SECONDS");
//		Keyword.openURL("https://www.amazon.in/");
	Keyword.logger_add("Click On continue");
		String Actual = Keyword.getWebElement("CSS", "#auth-continue-announce").getText();
		String Expected = "Continue";
		Assert.assertEquals(Actual, Expected);
	Keyword.clickOnElement("XPATH", "//input[@id='continue']");

	}

	@Test
	public void tc_11() throws InterruptedException {
		Set<String> childWindow = Constant.driver.getWindowHandles();
		System.out.println(childWindow);
		ArrayList<String> requiredWindow = new ArrayList<String>(childWindow);

//	Constant.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Keyword.implicit_Wait(5, "SECONDS");
		String Actual = Keyword
				.getWebElement("XPATH", "//div[@class='a-box a-alert a-alert-warning a-spacing-base']/div/h4")
				.getText();
		String Expected = "Mobile number already in use";

		System.out.println(Actual);
		Assert.assertEquals(Actual, Expected);

		String Actual1 = Keyword
				.getWebElement("CSS", "div.a-box.a-alert.a-alert-warning.a-spacing-base>div>div>p").getText();
		String Expected1 = "You indicated you are a new customer, but an account already exists with the mobile number +91 8625974462";

		System.out.println(Actual);
		Assert.assertEquals(Actual1, Expected1);
		System.out.println(Actual1);
	Keyword.logger_add("Get Error messgae");
	}
	
	
	
//	
//	
//	
////		Keyword.enterText("XPATH", "//input[@name='pass']", "acg@123");
////		
////		Keyword.selectValue("XPATH", "//select[@name='birthday_day']", "23");
////		Keyword.selectValue("XPATH", "//select[@name='birthday_month']", "Sept");
////		Keyword.selectValue("XPATH", "//select[@name='birthday_year']", "1994");
//		
}
