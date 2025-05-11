package clinicmanagement;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandling {

	WebDriver driver;
	public AlertHandling(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//span[contains(text(),'Staffs')]") WebElement staffmodule;
	
	//DELETE STAFF
	@FindBy(xpath="//tr[2]//a[@title='Delete'][1]") WebElement secondRowDelete;
	@FindBy(xpath="//button[contains(text(),'No, Cancel')]") WebElement cancelDelete;
	
	
	public void navStaffPage()
	{
		staffmodule.click();
	}
	
	public void checkAlertAndAccept()
	{
		secondRowDelete.click();

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			
					driver.switchTo().alert().accept(); 
					System.out.println("Alert Accepted");
		}
		catch(Exception e)
		{
			System.out.println("Alert NOT PRESENT");
			cancelDelete.click(); //cancel delete using locators, without alert handling
		}
		
		}
		
	}
	

