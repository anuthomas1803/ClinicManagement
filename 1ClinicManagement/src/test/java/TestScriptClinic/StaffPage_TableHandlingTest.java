package TestScriptClinic;

import org.testng.annotations.Test;

import clinicmanagement.SigninPage;
import clinicmanagement.StaffPage_TableHandling;

public class StaffPage_TableHandlingTest extends Baseclass {
	
	StaffPage_TableHandling staff;
	SigninPage signin;
	
	
	
  @Test
  public void isUserAbleToAddStaff() 
  {
	   signin = new SigninPage(driver);
	 signin.enterCredentials("admin@clinic.com","123456");
	 staff=new StaffPage_TableHandling(driver);
	 staff.navStaffPage();
	staff.delRow();
	
	//staff.getRowDetails();
	//staff.getSingleColumnDetails();
	// staff.addStaff();
	 //staff.selectRoleFromDropDown();
//	staff.getEntireColumnDetails();           
	// staff.searchFromTable();
	  
  }
  
  }
