package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.LoginPage;
import mainjava.BaseClass;
import mainjava.DashBoardpage;


public class BaseTest extends BaseClass{
	
	@BeforeClass
	public void initBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
//local to global method  objects
@BeforeClass
public void pageObjects() {
	 loginPage = new LoginPage(driver);
	 
	   dashBoardPage = new DashBoardpage(driver);
	  }



@AfterClass
public void tearDownEnvironment() {
	driver.quit();
}
	
	
	

}
