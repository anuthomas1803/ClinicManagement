package utility__clinic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility_Clinic {
WebDriver driver;
	public void waitForElementsToClick(WebDriver driver,WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitForElementsToSelect(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	public void waitForElementVisibility(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(null)));
	}
    public void textToBePresentInElement(WebDriver driver,WebElement element)
	{
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.textToBePresentInElement(element, null));
	}
    public void waitForAlert(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void waitForFramestobeAvailableAndSwitchtoThem(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}
}
