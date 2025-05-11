package TestScriptClinic;

import java.awt.AWTException;

import org.testng.annotations.Test;

import clinicmanagement.SigninPage;
import clinicmanagement.StaffPageAction_RobotClass;
import clinicmanagement.Staff_Doctors_MultipleWindowHandling;

public class Staff_Doctors_multipleWindowHandlingTest extends Baseclass{
	

  @Test
  public void isUserAbleToNavigateToStaffPage1() throws AWTException 
  {
	  SigninPage  signin = new SigninPage(driver);
	 signin.enterCredentials("admin@clinic.com","123456");
	 Staff_Doctors_MultipleWindowHandling window=new Staff_Doctors_MultipleWindowHandling(driver);
	//window.newTabStaffModule();
	window.newTabDoctorsModule();
}
}

