package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		//declaration
		@FindBy(name="username") private WebElement usn;
		@FindBy(name="pwd") private WebElement pass;
		@FindBy(id="loginButton") private WebElement loginBtn;
		@FindBy(id="keepLoggedInCheckBox") private WebElement keepLoggedInCheckbox;
		@FindBy(xpath = "//img[contains(@src,'timer')]") private WebElement logo;
		@FindBy(id="licenseLink") private WebElement licenseLink;
		
		//initialization
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		//utilization
		public WebElement getUsn() {
			return usn;
		}
		public WebElement getPass() {
			return pass;
		}
		public WebElement getLoginBtn() {
			return loginBtn;
		}
		public WebElement getKeepLoggedInCheckbox() {
			return keepLoggedInCheckbox;
		}
		public WebElement getLogo() {
			return logo;
		}
		public WebElement getLicenseLink() {
			return licenseLink;
		}
		
		//generic reusable methods
		
		public void actiTimeValidLogin(String validUsername,String validPassword) throws InterruptedException
		{
			usn.sendKeys(validUsername);
			pass.sendKeys(validPassword);
			loginBtn.click();
			Thread.sleep(2000);
			
		}
		
		public void actiTimeInvalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
		{
			usn.sendKeys(invalidUsername);
			pass.sendKeys(invalidPassword);
			loginBtn.click();
			Thread.sleep(1000);
			usn.clear();
		}
		
		//operational methods
	
		//my comment
}
