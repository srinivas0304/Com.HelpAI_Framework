package com.helpBot.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.helpBot.baseclass.BaseClass;

import botPages.HelpAndContact;
import botPages.SearchPage;


public class SearchTest extends BaseClass
{
	HelpAndContact hc;
	SearchPage sp;
	
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
	public void searchOption() throws Exception
	{
		hc=new HelpAndContact();
		sp=hc.clickOn();
		System.out.println("Title of the page: "+driver.getTitle());
		sp.searchOpt();
		sp.selectArticle();
		sp.scrollDown();
	}
}
