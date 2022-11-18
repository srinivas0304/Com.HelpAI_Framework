package botPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.helpBot.baseclass.BaseClass;

public class BotWindowPage extends BaseClass
{
	
	@FindBy(xpath="//div[@id='ocs_help_bot']//div[4]//button[2]")
	WebElement clickOnCantSignin;
	
	@FindBy(xpath="//div[@class='ohb-conv hoverSource']")
	WebElement timeStamp;
	
	
	public BotWindowPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cannotSignin() throws Exception
	{
//		WebDriverWait wait =new WebDriverWait(driver, 20);
//		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='ocs_help_bot']//div[4]//button[2]")));
//		wait.until(ExpectedConditions.elementToBeClickable(clickOnCantSignin));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",clickOnCantSignin);
	}
	
	public TextAreaPage verifyTimeStamp() throws Exception
	{
		Thread.sleep(2000);
		boolean timeSta=timeStamp.isDisplayed();
		System.out.println(timeSta);
		return new TextAreaPage();
		
	}
	
}
