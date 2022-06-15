package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import generic.WebDriverCommonLib;
import pagepackage.LoginPage;
import pagepackage.SettingsPage;

public class TestActiTimeSettingsDropdown extends BaseTest {

	@Test
	public void testSettingsDropdown() throws IOException, InterruptedException
	{
		 Flib flib = new Flib();
		 String username = flib.readPropertyFile(prop_path, "username");
		 String password = flib.readPropertyFile(prop_path, "password");
		 
		 LoginPage lp = new LoginPage(driver);
		 lp.actiTimeValidLogin(username,password);
		 
		 SettingsPage sp = new SettingsPage(driver);
		 sp.clickOnSettings();
		 
		 WebDriverCommonLib wb = new WebDriverCommonLib();
		 wb.getAllOptionsOfDropdown(sp.getTopgroupinglevelDropdown());
		 
		 
	}
}
