package DemoOpenCart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class GoogleImages {
	
	public void getsearch() throws InterruptedException, IOException {

	XSSFWorkbook workbook;

		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\NAVEENKUMAR\\Desktop\\Selenium\\selenium jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\NAVEENKUMAR\\Desktop\\Selenium\\Data.xlsx");
		 workbook = new XSSFWorkbook(fis);
		 XSSFSheet ws = workbook.getSheetAt(1);
		 
		 int rownum  = ws.getLastRowNum();
		 int colnum = ws.getRow(0).getPhysicalNumberOfCells();
		 System.out.println(colnum);
		 System.out.println(rownum);
		 XSSFCell searchkey;
		 for(int i = 1; i <= rownum ; i++) {
			 driver.get("http://www.google.com");
			 searchkey= ws.getRow(i).getCell(0);
			 System.out.println("Google search image for: "+searchkey);
			 driver.findElement(By.linkText("Images")).click();
			 driver.findElement(By.name("q")).sendKeys(searchkey.toString());
			
			 //driver.findElement(By.xpath("//span[@class='z1asCe MZy1Rb']//*[@focusable='false']")).click();
			 			 
			 WebElement textbox = driver.findElement(By.name("q"));
			 textbox.sendKeys(Keys.RETURN);
			 
			 Thread.sleep(3000);
			 System.out.println(driver.getTitle());
			 
			 driver.navigate().back();
			 
		 }
		 driver.close();	
	}
}
