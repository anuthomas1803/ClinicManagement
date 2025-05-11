package TestScriptClinic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import clinicmanagement.SigninPage;
import clinicmanagement.StaffPage_DropDown_RadioBtn;
import clinicmanagement.StaffPage_TableHandling;

public class StaffPage_DropDownTest extends Baseclass{
	SigninPage signin;
	StaffPage_TableHandling staff;
	StaffPage_DropDown_RadioBtn dropDown;
	
  @Test
  public void isUserAbletoAccessDropDownContactNo() {

		signin = new SigninPage(driver);
		signin.enterCredentials("admin@clinic.com","123456");
		staff=new StaffPage_TableHandling(driver);
		staff.navStaffPage();
	  dropDown= new StaffPage_DropDown_RadioBtn(driver);
	 
	 // dropDown.showResultDropDownSelection();
	   dropDown.addStaffPage(); 
	   dropDown.genderRadioButton();
	  //dropDown.selectContactNoCountryCode();
	  
  }
}
