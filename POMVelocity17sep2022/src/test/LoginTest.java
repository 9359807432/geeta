package test;

import org.testng.annotations.Test;
import mainjava.DashBoardpage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginTest extends BaseTest{
	@Test(priority=0, groups={"smoke","Regression"})
	public void verifyTitleOfLoginPage() {
		String verifyTitleOfLoginPage= loginPage.titleofLoginpage();
		Assert.assertEquals(verifyTitleOfLoginPage,"Login");
	}
	@Test(priority=1, groups={"smoke","Regression"})
	public void verifyUrlOfLoginPage() {
		String verifyUrlOfLoginPage= loginPage.UrlOfPage();
		Assert.assertEquals(verifyUrlOfLoginPage,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=2, groups={"smoke","Regression"})
	public void verifyloginwithcorrectcredentials() {
		loginPage.setUsername("Admin");
		loginPage.setpassword("admin123");
		loginPage.clickLogin();
		String titleOfDash= dashBoardPage.titleOfDashBoardPage();
		Assert.assertEquals(titleOfDash,"Dashboard");
	}
	@Test(priority=-1, groups={"smoke","Regression"})
	public void verifybuildname() {
		String verifyTitleOfbuildname= loginPage.titleofLoginpage();
		Assert.assertEquals(verifyTitleOfbuildname,"OrangeHRM");
	}
	
	
}
