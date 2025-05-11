package clinicmanagement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaffPage_TableHandling {
WebDriver driver;
	public StaffPage_TableHandling(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Staffs')]") WebElement staffmodule;
	
	//DELETE STAFF
	@FindBy(xpath="//tr[2]//a[@title='Delete'][1]") WebElement secondRowDelete;
	@FindBy(xpath="//a[contains(text(), 'Suhailsss K S')]//following::a[@title='Delete'][1]") WebElement firstRowDelete;
	@FindBy(xpath="//button[contains(text(),'No, Cancel')]") WebElement cancelDelete;
	
	//SINGLE COLUMN DETAIL
	@FindBy(xpath="//tbody/tr/td[1]") WebElement ColumnStaff;
	           
	//MULTIPLE COLUMN DETAILS
	@FindBy(xpath="//tr//td[1]") List<WebElement> entireColumnStaff3;
	//or
	@FindBy(xpath="//table//tr/td[1]") List<WebElement> entireColumnStaff2;
	@FindBy(xpath="//a[@class='mb-1 text-decoration-none fs-6']") List<WebElement> entireColumnStaff;
	@FindBy(xpath="//tr//*[contains(@class,'mb-1 text-decoration-none fs-6')]") List<WebElement> entireColumnStaff4;
	
	
	@FindBy(xpath="//table") WebElement tableStaff;

//xpath of a particular name //
	@FindBy(xpath="//table[@class='table table-striped']//child::a[contains(text(),'Suhailsss K S')]") WebElement parenttoChild;
	@FindBy(xpath="//a[contains(text(),'Suhailsss K S')]//parent::div") WebElement childtoParent;
	// single slash: to navigate to direct parent element and double slash before parent selects elements from anywhere in DOM tree
	
	
	
	@FindBy(xpath="//tbody/tr/td[1]") WebElement searchForAParticularElement; //get the complete row
	@FindBy(xpath="//*[normalize-space(.)='Suhailsss K S']") WebElement searchForAParticularElement3;
	@FindBy(xpath="//div[@class=\'d-flex justify-content-center\']//a[1]") WebElement searchForAParticularElement2;
	
	
	//@FindBy(xpath="//div[@class='swal-modal']")  WebElement alertdel;
	
	public void navStaffPage()
	{
		staffmodule.click();
	}
	
	public void delRow()
	{
		secondRowDelete.click();
		cancelDelete.click();
	}
	
	public void getSingleColumnDetails()
	{
		System.out.println(ColumnStaff.getText());
	}
	

	public void getEntireColumnDetails()
	{
		for(WebElement column:entireColumnStaff2)
		{
			System.out.println(column.getText());
		}
	}
	public void getRowDetails() {
		
	    boolean found = false;
	    for (WebElement column : entireColumnStaff3) {
	    	
	        if (column.getText().equalsIgnoreCase(searchForAParticularElement.getText())) {
	            System.out.println("Element found: " +column.getText());
	            found = true; 
	        }}

if (!found) { 
    System.out.println("Element not found."); 
    System.out.println(searchForAParticularElement.getText());
    
}

	    
	}

	
	public void searchFromTable()	
		{
			String Role="Staff";
			for(WebElement column:entireColumnStaff)
			{
			if(column.getText().equals(Role)) //  OR if(element.getText().equalsIgnoreCase(input))
			{
				System.out.println("Element Found");
			}
			}

	}
	
	

}