package clinicmanagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASigninpagewithoutPageFactory {
public WebDriver driver;
	public static void main(String[] args) {
		// TODO  Auto-generated method stub
		ASigninpagewithoutPageFactory login= new ASigninpagewithoutPageFactory();
		login.baseClass();
		login.isUserAbleTOLoginWithValidCredentials();
	}

	public void baseClass()
	{
		driver=new ChromeDriver();
		driver.get("https://clinic.qalegend.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void isUserAbleTOLoginWithValidCredentials()
	{
		WebElement Email= driver.findElement(By.id("email"));
		Email.sendKeys("admin@clinic.com");
		WebElement Password= driver.findElement(By.id("password"));
		Password.sendKeys("123456");
		WebElement Rememberme=driver.findElement(By.id("remember_me"));
		Rememberme.click();
	    WebElement login=driver.findElement(By.xpath("//button[(text()='Login')]"));
		login.click();
	}
		
		
		
		
	
	}
	
	
