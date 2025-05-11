package clinicmanagement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaffPage_DropDown_RadioBtn {
	WebDriver driver;
	public StaffPage_DropDown_RadioBtn(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//STAFF MODULE
	@FindBy(xpath="//a[@class='btn btn-primary ms-auto']") WebElement addStaff;

	
	@FindBy(xpath="//div[@class='iti__arrow']") WebElement countryCodedropDown;
	
	@FindBy(xpath="//div[@class='iti__flag-container']//li[@id='iti-0__item-id']") WebElement codeIndonesia;
	@FindBy(id="phoneNumber") WebElement phoneNumber;
	@FindBy(id="perPage") WebElement showResultDropDownMenu;
	
	@FindBy(xpath="//input[@class='form-check-input ms-2' and @value='2']") WebElement RadioButtonF;
	
	public void addStaffPage()
	{	
		addStaff.click();
	}

	//NOT A SELECT CLASS
	public void selectContactNoCountryCode()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(countryCodedropDown));
		countryCodedropDown.click();
		codeIndonesia.click();
		phoneNumber.sendKeys("607859435");
	}
	
	//SELECT CLASS
	public void showResultDropDownSelection()
	{
		Select sel=new Select(showResultDropDownMenu);
		//sel.selectByValue("25");
		sel.selectByIndex(2);  //50
		//sel.selectByVisibleText("25");
	}
	
	//RADIO BUTTON
	public void genderRadioButton()
	{
		RadioButtonF.click();
	}
	
}
