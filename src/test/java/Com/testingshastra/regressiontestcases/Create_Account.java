package com.testingshastra.regressiontestcases;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import  com.testingshastra.keywords.Constant;
import  com.testingshastra.keywords.Keyword;
import  com.testingshastra.keywords.Sign_Up_Page;
public class Create_Account {
	

	@BeforeTest
	public void tc_011() {
		Keyword.openBrowser("Chrome");
		Keyword.openURL("https://www.amazon.in/");
		Actions action =new Actions(Constant.driver);
		WebElement element=Keyword.getWebElement("XPATH", "//*[@id=\"nav-link-accountList\"]");
		Keyword.implicit_Wait(5, "SECONDS");
		action.moveToElement(element);
		Keyword.implicit_Wait(5, "SECONDS");
		Keyword.clickOnElement("XPATH", "//*[@id=\"nav-signin-tooltip\"]/div/a");
		
		
	}
	
	@Test
public void create_Account() {
		
		Keyword.implicit_Wait(5, "SECONDS");
	Sign_Up_Page.Sign_Up("Manisha", "8541563214", "12345");

}
}
