package TestScriptClinic;

import org.testng.annotations.Test;

import clinicmanagement.AlertHandling;
import clinicmanagement.SigninPage;


public class AlertHandlingTest extends Baseclass {
	AlertHandling alert;
	SigninPage signin;
	
	
	
@Test
public void isUserAbleToAddStaff() 
{
	 signin = new SigninPage(driver);
	 signin.enterCredentials("admin@clinic.com","123456");
	 alert=new AlertHandling(driver);
	 alert.navStaffPage();
	 alert.checkAlertAndAccept();
}
}