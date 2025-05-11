package TestScriptClinic;

import java.awt.AWTException;

import org.testng.annotations.Test;

import clinicmanagement.SigninPage;
import clinicmanagement.StaffPageAction_RobotClass;


public class StaffPage_ActionClassTest extends Baseclass {
	StaffPageAction_RobotClass actioncls;

  @Test
  public void isUserAbleToNavigateToStaffPage() throws AWTException 
  {
	  SigninPage  signin = new SigninPage(driver);
	 signin.enterCredentials("admin@clinic.com","123456");
	 StaffPageAction_RobotClass staff1=new StaffPageAction_RobotClass(driver);
	// staff1.clickStaffModule();
	staff1.StaffModuleInAnewTab();
}
}
