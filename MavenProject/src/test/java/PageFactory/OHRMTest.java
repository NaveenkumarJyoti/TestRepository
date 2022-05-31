package PageFactory;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRMTest {
	String drvierPath="C:\\\\Users\\\\NAVEENKUMAR\\\\Desktop\\\\Selenium\\\\selenium jars\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe";
	 WebDriver driver;
	
	 Login login;
	 Home home;
	 
	 @BeforeTest
	 public void setup() {
		 System.setProperty("webdriver.gecko.driver", drvierPath);
		 driver=new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	 }
	 
	 @Test
	 public void testHomePageAppearCorrect() {
		 login=new Login(driver);
		 login.loginToOHRM("Admin", "admin123");
		 home=new Home(driver);
		 
		 Assert.assertTrue(home.getHomePageDashboardUserName().matches("^Welcome [A-Z|a-z]+"));
		 driver.close();
	 }
}
