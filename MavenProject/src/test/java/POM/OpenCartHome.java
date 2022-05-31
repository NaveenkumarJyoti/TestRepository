package POM;

import org.openqa.selenium.WebDriver;

public class OpenCartHome {

	WebDriver driver;
	 
	 
	 public OpenCartHome(WebDriver driver) {
		 this.driver=driver;
	 }
	 
	 public String getHomePage() {
		 return driver.getTitle();
	 }
}
