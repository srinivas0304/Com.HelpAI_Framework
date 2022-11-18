package botPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.helpBot.baseclass.BaseClass;


public class TextAreaPage extends BaseClass
{
	@FindBy(xpath="//textarea[@id='ohb_ft_input']")
	WebElement typInTextArea;
	
	@FindBy(xpath="//button[@id='ohb_ft_send_btn']")
	WebElement clickOnSendBtn;
	
	@FindBy(xpath="(//div[@class='hoverSource'])[6]")
	WebElement text;
	
	public TextAreaPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void textArea()
	{
		WebDriverWait wait =new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//textarea[@id='ohb_ft_input']")));
		typInTextArea.sendKeys("return");
	}
	
	public void sendBtn()
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(clickOnSendBtn));
		//clickOnSendBtn.click();	
	}
}
