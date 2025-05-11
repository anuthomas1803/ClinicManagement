package clinicmanagement;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SigninPage {
	 WebDriver driver;


	public SigninPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="email") WebElement emailfield;
	
	
    @FindBy(id="password") WebElement PasswordByCHILD;
    @FindBy(xpath="//div[@class='mb-sm-7 mb-4']//child::input[@id='password']") WebElement Password;
    
    @FindBy(id="remember_me") WebElement rememberme;
    
	@FindBy(xpath="//button[(text()='Login')]") WebElement login;
	@FindBy(xpath="//div[@class='d-grid']//child::button[@class='btn btn-primary']") WebElement loginByCHILD ;
    
    @FindBy(xpath="//span[text()='These credentials do not match our records.']") WebElement errorMessage;
    @FindBy(xpath="//li[@class=\'nav-item active\']") WebElement dashBoard;
    public void enterCredentials(String email, String password)
	{
    	 // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30)); //wait upto 10sec to load. stops as soon as the actions takes place.
    	 // wait.until(ExpectedConditions.elementToBeClickable(emailfield));
    emailfield.sendKeys(email);
	Password.sendKeys(password);
	rememberme.click();
	login.click();
		}
    public boolean isErrormessagedisplayed()
    {
    	return errorMessage.isDisplayed();
    }
    public boolean isDashBoarddisplayed()
    {
    	return dashBoard.isDisplayed();
    }
    
}
