package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PilgrimsPage extends PageBase{

	public PilgrimsPage(WebDriver driver) {
		super(driver);
	}

	
	
	@FindBy(id = "sys-log-email")
	WebElement emailTxt;
	
	@FindBy(id = "sys-log-password")
	WebElement passwordTxt;
	
	@FindBy(id = "sys-log-submit")
	WebElement loginBtn;
	
	@FindBy(xpath = "/html/body/main/div/div/div[3]/div[1]/div/div[2]/p")
	public WebElement SuccessLoginTxt;
	
	@FindBy(xpath = "/html/body/div[1]/header/nav/div/div[2]/div/ul/li[4]/a")
	WebElement Pilgrim;
	
	
	
	@FindBy(xpath = "/html/body/main/div[1]/div[1]/div/form/div[1]/div[1]/div/input")
	WebElement pilgrimName;
	
	@FindBy(xpath = "/html/body/main/div[1]/div[1]/div/form/div[1]/div[2]/div/input")
	WebElement passportNumber;
	
	@FindBy(xpath = "/html/body/main/div[1]/div[1]/div/form/div[1]/div[5]/div/input")
	WebElement fileNumber;
	
	@FindBy(xpath = "/html/body/main/div[1]/div[1]/div/form/div[2]/div[1]/div/input")
	WebElement companyLicenseNumber;
	
	@FindBy(xpath = "/html/body/main/div[1]/div[1]/div/form/div[2]/div[3]/button[1]")
	WebElement searchBtn;
	

	@FindBy(id = "navbarDropdown")
	WebElement settings;
	
	@FindBy(id = "sys-logout")
	WebElement logout;
	
	@FindBy(xpath = "/html/body/main/div[1]/div[5]/div/p[2]")
	public WebElement noResultFound;
	
	
	
	public void LoginData(String email, String password) throws InterruptedException {
		
		setTextElementText(emailTxt, email);
		setTextElementText(passwordTxt, password);
		clickButton(loginBtn);
		Thread.sleep(3000);
	}
	
	
	public void SetPilgrimDataSearch(String pilgrimname, String passportnumber, String filenumber, String Companylicensenumber) throws InterruptedException {
		clickButton(Pilgrim);
		Thread.sleep(2000);
		setTextElementText(pilgrimName, pilgrimname);
		setTextElementText(passportNumber, passportnumber);
		setTextElementText(fileNumber, filenumber);
		setTextElementText(companyLicenseNumber, Companylicensenumber);
		clickButton(searchBtn);
		Thread.sleep(2000);
	}
	
	public void logOut() {
		clickButton(settings);
		clickButton(logout);
	}
	
	
	
	public void SetPilgrimDataSearchLicenseNumber(String Companylicensenumber) throws InterruptedException {
		clickButton(Pilgrim);
		Thread.sleep(2000);
		setTextElementText(companyLicenseNumber, Companylicensenumber);
		clickButton(searchBtn);
		Thread.sleep(2000);
	}
	
	public void SetPilgrimDataSearchPilgrimName(String pilgrimname) throws InterruptedException {
		clickButton(Pilgrim);
		Thread.sleep(2000);
		setTextElementText(pilgrimName, pilgrimname);
		clickButton(searchBtn);
		Thread.sleep(2000);
	}
	
	public void SetPilgrimNotExistDataSearch(String pilgrimname, String passportnumber, String filenumber, String Companylicensenumber) throws InterruptedException {
		clickButton(Pilgrim);
		Thread.sleep(2000);
		setTextElementText(pilgrimName, pilgrimname);
		setTextElementText(passportNumber, passportnumber);
		setTextElementText(fileNumber, filenumber);
		setTextElementText(companyLicenseNumber, Companylicensenumber);
		clickButton(searchBtn);
		Thread.sleep(2000);
	}
	
}
