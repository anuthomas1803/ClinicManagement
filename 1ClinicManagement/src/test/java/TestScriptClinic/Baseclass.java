package TestScriptClinic;

import java.time.Duration;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Baseclass {
	public WebDriver driver;
	 @BeforeMethod
	public void beforeMethod()
	{
		
	driver = new ChromeDriver();
	driver.get("https://clinic.qalegend.com/login/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.manage().window().maximize();
	
	//driver.manage().window().setSize(new Dimension(1024,768));//customize window size 
	}


	//@AfterMethod
	public void AfterMethod()
	{
		driver.quit();
	}
	
}


