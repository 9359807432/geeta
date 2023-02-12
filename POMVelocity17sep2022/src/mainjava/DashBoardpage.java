package mainjava;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class DashBoardpage extends BaseTest {
	
	@FindBy(xpath="//h6[text()='DashBoard']")
	
	WebElement titleDashBoard;
	
	public DashBoardpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public  String titleOfDashBoardPage() {
		return titleDashBoard.getText();
	}
	
	
	
	
	
	
	

}
