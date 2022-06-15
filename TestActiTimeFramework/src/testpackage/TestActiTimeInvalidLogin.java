package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListener;
import generic.Flib;
import pagepackage.LoginPage;

@Listeners(CustomListener.class)
public class TestActiTimeInvalidLogin extends BaseTest {

	@Test
	public void ActiTimeInvalidLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Flib flib = new Flib();
		
		int rc = flib.getRowCount(excel_path, "invalidcreds");
		
		LoginPage lp = new LoginPage(driver);
		for(int i=1;i<=rc;i++)
		{	
			String username = flib.readExcelData(excel_path,"invalidcreds", i, 20);
			String password = flib.readExcelData(excel_path,"invalidcreds", i, 1);
			lp.actiTimeInvalidLogin(username, password);
		}
	}
}
