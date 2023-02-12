package mainjava;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

// methods
public class LoginPage extends BaseTest{
	@FindBy(xpath="//*[text()= 'Login']")
	WebElement txtLoginpage;
	
	@FindBy(name="username")
	WebElement UserName;
	@FindBy(name="password")
	WebElement pass;
	@FindBy(tagName="button")
	WebElement btnLogin;
		
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public String titleofLoginpage() {
		return txtLoginpage.getText();
		}
	public String UrlOfPage() {
		return driver.getCurrentUrl();
	}
	public void setUsername(String  usrName) {
		UserName.sendKeys(usrName);
		
}
	public void setpassword(String password) {
		pass.sendKeys(password);
	}
	
	public void clickLogin() {
                btnLogin.click();
	}
	public String getBuildTitle() {
		return driver.getTitle();
	}

}
