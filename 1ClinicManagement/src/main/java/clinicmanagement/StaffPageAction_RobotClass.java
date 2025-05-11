package clinicmanagement;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaffPageAction_RobotClass {

	WebDriver driver;
	public StaffPageAction_RobotClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Staffs')]") WebElement staffmodule;
	
	//SINGLE CLICK
	public void clickStaffModule()
	{
		Actions actions= new Actions(driver);
		actions.moveToElement(staffmodule);
		actions.click().perform();  //only one action so no build() is used here	
	}	
	
	public void StaffModuleInAnewTabNO() throws AWTException    //NOT WORKING
	{
		Actions actions=  new Actions(driver);   //only single action so no build() is used here
		actions.contextClick(staffmodule).perform();
		actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
	}
	
	public void StaffModuleInAnewTab() throws AWTException
	{
		Actions action=new Actions(driver);
		action.contextClick(staffmodule).perform();
		Robot robot = new Robot();
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}	}

	
