package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {


	public  PageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	protected WebDriver driver;
	public JavascriptExecutor jse;
	public static Select select;
	public Actions action;
	

	//This Method Will use it in all pages that want click button
	protected static void clickButton(WebElement button)
	{
		button.click();
	}

	protected static void clearWebElement(WebElement textbox) {
		textbox.clear();
		
	}

	//This method will used all over the project to send the texts
	protected static void setTextElementText(WebElement txtElement , String value)
	{
		txtElement.sendKeys(value);
	}

	public void scrollToTheMiddle() {

		jse.executeScript("scrollBy(0,150)");
	}

	public void scrollToBottom()
	{
		jse.executeScript("scrollBy(0,2500)");
	}
	
	

}
