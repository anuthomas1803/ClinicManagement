package clinicmanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaffPageXpathLocators {
public WebDriver driver;

public StaffPageXpathLocators(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}
// XPATH : text
@FindBy(xpath="//a[@type='button']") WebElement addStaffButton;
@FindBy(xpath="//a[@type='button' and  @class='btn btn-primary ms-auto']") WebElement addStaffButton2;
@FindBy(xpath="//a[contains(text(),'Add Staff')]")  WebElement addStaffButton3;
@FindBy(xpath="//a[normalize-space()='Add Staff']") WebElement addStaffButton4; 
@FindBy(xpath="//a[normalize-space(text())='Add Staff']") WebElement addStaffButton5; 
              // OUTER NODE TO INNER NODE NAVIGATION
// 1. Parent to child navigation
@FindBy(xpath="//div[@class='d-flex justify-content-end ']/a[@type='button']") WebElement addStaffButtonChild;
@FindBy(xpath="//div[@class='d-flex justify-content-end ']/child::a WebElement") WebElement addStaffButtonChild2;

// 2. Ancestor-Descendant navigation(parent,grandparent to child,grand child)
@FindBy(xpath="//div[@class='d-flex flex-column']//a[@type='button']") WebElement addStaffButtonindirect1;
@FindBy(xpath="//div[@class='d-flex flex-column']//descendant::a[@type='button']") WebElement addStaffButtonindirect2;

//3.Axes Navigation (Navigate based on document order, following and preceding)-- in Document order
@FindBy(xpath="//div[@class='d-flex flex-column']//following::a[@type='button']") WebElement addStaffButtonselectAllnodes;
@FindBy(xpath="//div[@class='d-flex justify-content-end ']//following-sibling::a") WebElement addStaffButtonselectSiblingnodes;
@FindBy(xpath="//a[normalize-space(text())= 'Add Staff']//preceding::div[@id='nav-overly']")  WebElement addStaffprecedingEg;
//OUTER NODE TO INNER NODE NAVIGATION

//1.Select the parent node of the child element.

@FindBy(xpath="//a[normalize-space(text())= 'Add Staff']/parent::div") WebElement addStaffchildtoPArentdirect;
@FindBy(xpath="//a[normalize-space(text())= 'Add Staff']//ancestor::div[@class='d-flex justify-content-end ']") WebElement addStaffchildtoAncestorindirect;





}