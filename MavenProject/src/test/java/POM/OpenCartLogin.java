package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLogin {

	WebDriver driver;
    By userEmail = By.name("email");
    By password = By.name("password");
    By login = By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");

    public OpenCartLogin(WebDriver driver){
        this.driver = driver;
    }

    public void setUserEmail(String strUserEmail){
        driver.findElement(userEmail).sendKeys(strUserEmail);
    }

    public void setPassword(String strPassword){
         driver.findElement(password).sendKeys(strPassword);
    }

    public void clickLogin(){
    	driver.findElement(login).click();
    }

    public void loginToOpenCart(String strUserEmail,String strPasword){
        this.setUserEmail(strUserEmail);
        this.setPassword(strPasword);
        this.clickLogin();        
    }
}
