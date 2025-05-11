package clinicmanagement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constant;

public class StaffPAgeImageUpload {
	WebDriver driver;
	public StaffPAgeImageUpload(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Staffs')]") WebElement staffmodule;
    @FindBy(xpath="//a[@class='btn btn-primary ms-auto']") WebElement addStaff;
    @FindBy (xpath="//input[@name='profile']") WebElement BrowseImage2;
    @FindBy (xpath="//input[@type='file' and  @class='image-upload d-none profile-validation']") WebElement BrowseImage;

    //XPATH
    // <input type="file"> element that is hidden (display: none). That’s the element you should use with sendKeys().
    
    
    
    public void robotFileUpload1() throws AWTException 
    {
    	  driver.navigate().to("https://clinic.qalegend.com/admin/staffs/create");
		StringSelection fileselect = new StringSelection("C:\\Users\\anuth\\eclipse-workspace\\1ClinicManagement\\src\\main\\resources\\CompressJPEG.Online_1_35_6839.jpg");
	    
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
	    javascript.executeScript("window.scrollBy(0,2000)", "");

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("profileImageIcon"))); // Match locator with @FindBy
	     BrowseImage.click();
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileselect, null);
		Robot robot = new Robot();
		robot.delay(20);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
    public void robotFileUpload() throws AWTException, InterruptedException {
        driver.navigate().to("https://clinic.qalegend.com/admin/staffs/create");

        JavascriptExecutor javascript = (JavascriptExecutor) driver;
        javascript.executeScript("window.scrollBy(0,2000)", "");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        
        // Wait for and click the icon that opens the file dialog
        wait.until(ExpectedConditions.elementToBeClickable(BrowseImage));
        BrowseImage.click();

        // Prepare file path
        StringSelection fileselect = new StringSelection("C:\\Users\\anuth\\eclipse-workspace\\1ClinicManagement\\src\\main\\resources\\CompressJPEG.Online_1_35_6839.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileselect, null);

        // Use Robot to paste path and hit Enter
        Robot robot = new Robot();
        robot.delay(500); // Give the file dialog time
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


	public void browseImage() {
	    driver.navigate().to("https://clinic.qalegend.com/admin/staffs/create");

	    JavascriptExecutor javascript = (JavascriptExecutor) driver;
	    javascript.executeScript("window.scrollBy(0,2000)", "");

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.elementToBeClickable(BrowseImage)); // Match locator with @FindBy

	    // Only use sendKeys — no need for click
	    BrowseImage.sendKeys("C:\\Users\\anuth\\eclipse-workspace\\1ClinicManagement\\src\\main\\resources\\CompressJPEG.Online_1_35_6839.jpg");
	}}