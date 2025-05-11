package clinicmanagement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Staff_Doctors_MultipleWindowHandling_IFrames {
WebDriver driver;
public  Staff_Doctors_MultipleWindowHandling_IFrames(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//span[contains(text(),'Staffs')]") WebElement staffmodule;

@FindBy(xpath="//span[contains(text(),'Doctors')][1]") WebElement doctorsmodule;
//span[@class="aside-menu-title" and normalize-space()="Doctors"]

@FindBy(id="a077aa5e") WebElement iframe1;

public void newTabStaffModule() throws AWTException
{
	Actions action=new Actions(driver);
	action.contextClick(staffmodule).perform(); //right click
	Robot robot=new Robot();
	robot.delay(300);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);	
	robot.keyRelease(KeyEvent.VK_ENTER);
}

public void newTabDoctorsModule() throws AWTException
{
	newTabStaffModule() ;
	
	Robot robot=new Robot();
	robot.delay(300);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_T);	
	
	//PARENT WINDOW
	
	String parent=driver.getWindowHandle(); //handles parent window. Get address of parent window.
	System.out.println("parent window "+parent);
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	
	Set<String> allwindow=driver.getWindowHandles();	//handles all open windows without duplication. 
	System.out.println("All window "+allwindow);
	List<String> handles=new ArrayList<>(allwindow); //STORE INDEX VALES OF WINDOWS
	
	// SWITCH TO INDEX 1 WINDOW 
	driver.switchTo().window(handles.get(1)); 
	driver.navigate().to("https://clinic.qalegend.com/admin/doctors");
	System.out.println("DOCTOR WINDOW IS " +driver.getTitle());
	
	// SWITCH TO INDEX 2 WINDOW 
	driver.switchTo().window(handles.get(2));
	System.out.println("SECOND WINDOW IS " +driver.getTitle());
	
	// SWITCH TO INDEX 0 WINDOW/PARENT 
	driver.switchTo().window(handles.get(0));
	System.out.println("PARENT WINDOW IS " +driver.getTitle());   
}

@FindBy(xpath="//img[@src='Jmeter720.png']") WebElement imageIniframe;
public void frames()
{
	//now use the switch command
	driver.switchTo().frame(iframe1);  //FIRST LOCATE THE IFRAME, THEN WITHIN THE IFRAME IS THE IMAGE. LOCATE IT & CLICK IT
	imageIniframe.click();

}
}
