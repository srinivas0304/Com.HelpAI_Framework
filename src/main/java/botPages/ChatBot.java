package botPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.helpBot.baseclass.BaseClass;

public class ChatBot extends BaseClass
{
	@FindBy(xpath="//a[@id='helpBotChat']")
	WebElement chatBot;
	
	public ChatBot() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public BotWindowPage clickOnChatBot() throws Exception
	{
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@id='helpBotChat']")));
//		wait.until(ExpectedConditions.elementToBeClickable(chatBot));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",chatBot);
		chatBot.click();
		return new BotWindowPage();
	}	
}
