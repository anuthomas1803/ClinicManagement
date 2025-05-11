package TestScriptClinic;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import clinicmanagement.SigninPage;
import clinicmanagement.StaffPageAction_RobotClass;
import clinicmanagement.Staff_Doctors_MultipleWindowHandling_IFrames;

public class Staff_Doctors_multipleWindowHandlingTest extends Baseclass{
	

  @Test
  public void isUserAbleToNavigateToStaffPage1() throws AWTException 
  {
	  SigninPage  signin = new SigninPage(driver);
	 signin.enterCredentials("admin@clinic.com","123456");
	 Staff_Doctors_MultipleWindowHandling_IFrames window=new Staff_Doctors_MultipleWindowHandling_IFrames(driver);
	//window.newTabStaffModule();
	window.newTabDoctorsModule();
	
}
  @Test
  public void framehandling()
  {
	  WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
		//First find the element using any of locator stratergy
	 Staff_Doctors_MultipleWindowHandling_IFrames IFrames=new Staff_Doctors_MultipleWindowHandling_IFrames(driver);
	IFrames.frames(); 
	  
  }
}

