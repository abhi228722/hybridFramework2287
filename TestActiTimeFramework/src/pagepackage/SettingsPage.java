package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {

	@FindBy(linkText = "Settings") private WebElement Settings;
	@FindBy(xpath = "//select[@name='firstHierarchyLevelCode']") private WebElement TopgroupinglevelDropdown;
	@FindBy(xpath = "//select[@name='secondHierarchyLevelCode']") private WebElement MiddlegroupinglevelDropdown;
	@FindBy(xpath = "//select[@name='thirdHierarchyLevelCode']") private WebElement TimeentrylevelDropdown;
	
	//initialization
	
	public SettingsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	



	public WebElement getSettings() {
		return Settings;
	}

	

	public WebElement getTopgroupinglevelDropdown() {
		return TopgroupinglevelDropdown;
	}

	public WebElement getMiddlegroupinglevelDropdown() {
		return MiddlegroupinglevelDropdown;
	}

	public WebElement getTimeentrylevelDropdown() {
		return TimeentrylevelDropdown;
	}

	//generic reusable methods
	
	//operational methods
	
	public void clickOnSettings()
	{
		Settings.click();
	}

		
	
}
