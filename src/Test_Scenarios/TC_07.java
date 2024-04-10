//Verify that search results are displayed.
package Test_Scenarios;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pageobjectmodel.Loginpage;

import org.testng.Assert;


public class TC_07 {
	public String Url = "https://magento.softwaretestingboard.com/";
	String driverPath = "C:\\Users\\Shiks\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver;
	
	@BeforeTest
	public void launch() {
		System.out.println("Launching the browser");
		Loginpage login;
		WebDriver driver;
	}
	
	@Test()
	public void Lumalogin() {
		System.setProperty("webdriver.driver.chromedriver", driverPath);
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		Loginpage page = new Loginpage(driver);
		page.EnterDetails();
	}
		
	@Test()
	public void SearchItem() {
		System.out.println("Enter the details in searchbox");
		driver.findElement(By.id("search")).sendKeys("Shirt");
		driver.findElement(By.xpath("//button[@title=\"Search\"]")).click();
	}	
	@AfterTest
	public void close() {
		driver.quit();
		
	}
		
	
	

}
