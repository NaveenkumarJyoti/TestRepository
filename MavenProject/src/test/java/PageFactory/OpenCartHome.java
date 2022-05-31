package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OpenCartHome {
	WebDriver driver;
	
	public OpenCartHome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
}
