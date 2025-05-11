package TestScriptClinic;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import clinicmanagement.SigninPage;
import utility__clinic.ExcelReadUtility;

public class SignInTest extends Baseclass {
	SigninPage signin;
	
	
	@Test(priority=1)
  public void verifyLoginWithValidCredentials()
	{
		
		signin = new SigninPage(driver);
		signin.enterCredentials("admin@clinic.com","123456");
		//Assert.assertTrue(signin.isDashBoarddisplayed(),"DashBoard not displayed");
	}
	
	@DataProvider(name="credentials")
	public Object[][] testdata() //2D object Array
	{
	Object[][] data= {{"admin@clinic.com","123"},{"admin@clinic","123456"},{"Admmin@","12"}};
	return data;
	}	
	
	@Test(dataProvider="credentials")
	public void verifyLoginWithINValidCredentials(String username,String password)
	{
		
		signin = new SigninPage(driver);
		signin.enterCredentials(username,password);
       Assert.assertTrue(signin.isErrormessagedisplayed(),"No alert displayed");
       }
	
	@Test
	  public void verifyLogin() throws IOException,AWTException
		{
		String username3 = ExcelReadUtility.readStringData(1, 0, "Sheet1");
		String password3 = ExcelReadUtility.readIntegerData(1, 1, "Sheet1");
			
			signin = new SigninPage(driver);
			signin.enterCredentials(username3,password3);
			Assert.assertTrue(signin.isDashBoarddisplayed(),"DashBoard not displayed!!!");
		}
		
}

