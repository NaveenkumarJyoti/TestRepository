package POM;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {

	String driverPath="C:\\Users\\NAVEENKUMAR\\Desktop\\Selenium\\selenium jars\\geckodriver-v0.31.0-win64\\geckodriver.exe";
	
	WebDriver driver;
	
	OpenCartLogin login;
	OpenCartHome home;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().to("https://demo.opencart.com/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	
	@Test(priority = 0)
	public void homePageTitleAppearCorrect() {
		login=new OpenCartLogin(driver);
		login.loginToOpenCart("vvbatch07@gmail.com", "Batch@007");
		home=new OpenCartHome(driver);
		System.out.println(home.getHomePage());
		Assert.assertFalse(home.getHomePage().matches("[A-z|a-z]+"));
		driver.close();
	}

}
