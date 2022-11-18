package com.helpBot.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.helpBot.baseclass.BaseClass;

import botPages.HelpAndContact;


public class HelpAndContactTest extends BaseClass
{
	HelpAndContact help;
	
	@BeforeMethod
	public void load() throws Exception
	{
		launchBrowser();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void clickOnHelpAnContact() throws Exception
	{
		help=new HelpAndContact();
		help.clickOn();
	}
}
