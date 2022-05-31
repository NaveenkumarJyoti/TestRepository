package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenCartLogin {
	WebDriver driver;
	
	@FindBy(name="email")
	WebElement userEmail;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	WebElement login;
	
	public OpenCartLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserEmail(String strEmail) {
		userEmail.sendKeys(strEmail);
	}
	
	public void setPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public void loignToOpenCart(String Email,String Password) {
		this.setUserEmail(Email);
		this.setPassword(Password);
		this.clickLogin();
	}
}
