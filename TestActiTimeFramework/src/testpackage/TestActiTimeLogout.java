package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;

public class TestActiTimeLogout extends BaseTest {

	@Test
	public void ActiTimeLogout() throws IOException, InterruptedException
	{
		 
		 
		 Flib flib = new Flib();
		 String username = flib.readPropertyFile(prop_path, "username");
		 String password = flib.readPropertyFile(prop_path, "password");
		 
		 LoginPage lp = new LoginPage(driver);
		 lp.actiTimeValidLogin(username,password);
		 
		 Thread.sleep(2000);
		 
		 HomePage hp = new HomePage(driver);
		 hp.clickLogout();
	}
}
