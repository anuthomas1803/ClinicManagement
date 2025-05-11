package TestScriptClinic;

import java.awt.AWTException;

import org.testng.annotations.Test;

import clinicmanagement.SigninPage;
import clinicmanagement.StaffPAgeImageUpload;
import clinicmanagement.StaffPage_TableHandling;

public class StaffPageImageUploadTest extends Baseclass {
    @Test
  public void isUserAbletoUploadImage() throws AWTException, InterruptedException {

    	SigninPage	signin = new SigninPage(driver);
		signin.enterCredentials("admin@clinic.com","123456");
		StaffPAgeImageUpload  image=new StaffPAgeImageUpload(driver);
		//image.browseImage();
		image.robotFileUpload();
  }
}