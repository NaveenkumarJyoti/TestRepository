package DemoOpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Login {
	
	static String drivePath="C:\\\\Users\\\\NAVEENKUMAR\\\\Desktop\\\\Selenium\\\\selenium jars\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe";
	WebDriver driver;
	
	@Test
	public void loginOpenCart()
	{
		System.setProperty("webdriver.gecko.driver", drivePath);
		driver=new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		
//		Select dropdown=new Select(driver.findElement(By.linkText("My Account")));
//		dropdown.selectByVisibleText("Login");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("naviinkj17@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("asDF@123");
		driver.findElement(By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")).click();
		
		System.out.println(driver.getTitle());
		driver.close();
	}
	
}
