package com.helpBot.locators;

import org.openqa.selenium.By;

import com.helpBot.baseclass.BaseClass;

public class Locators extends BaseClass
{
	
		private By helpContact=By.xpath("//a[text()=' Help & Contact']");
		private By searchBox=By.xpath("//div[@class='search-input-box-home']//input");
		private By article=By.xpath("//div[@class='list_box']//div//a[2]");
		private By clickingOnChatBot=By.xpath("//a[@id='helpBotChat']");
		private By clickOnCantSignin=By.xpath("//div[@id='ocs_help_bot']//div[4]//button[2]");
		private By timeStamp=By.xpath("//div[@class='ohb-conv hoverSource']");
		private By typInTextArea=By.xpath("//textarea[@id='ohb_ft_input']");
		private By clickOnSendBtn=By.xpath("//button[@id='ohb_ft_send_btn']");
		private By text=By.xpath("(//div[@class='hoverSource'])[6]");
		
		public void helpContact()
		{
			driver.findElement(helpContact);
		}
		
}
