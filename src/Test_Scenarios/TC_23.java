// Verify the header operations work smoothly.
package Test_Scenarios;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import pageobjectmodel.Loginpage;

import org.testng.annotations.*;
import org.testng.Assert;

public class TC_23 {
	
	public String baseUrl = "https://magento.softwaretestingboard.com/";
	String driverPath = "C:\\Users\\Shiks\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	 WebDriver driver;
	
	@BeforeTest
	public void launch() {
		System.out.println("Launcing the chrome browser");
		Loginpage login;
		WebDriver driver;

	}
	
	@Test(priority=0)
	public void LumaLogin() {
		System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
//		login.EnterDetails();
		Loginpage page = new Loginpage(driver);
		page.EnterDetails();
	}
	
	//  testing the what's new function
	@Test(priority=1)
	public void whatsnew() {
		System.out.println("Verify the What's new functionalities");
		driver.findElement(By.linkText("What's New")).click();
		
	}
	// testing the women section function

	@Test(priority=2)
	public void womenSection(){
		System.out.println("Verify the women section functionality");
		driver.findElement(By.linkText("Women")).click();
		
	}
	//  testing the men section function

	@Test(priority=3)
	public void menSection() {
		System.out.println("Verify the men sction functionality");
		driver.findElement(By.linkText("Men")).click();
		
	}
	
	//  testing the Gear section function

	@Test(priority=4)
	public void gearSection() {
		System.out.println("Verify the gear section");
		driver.findElement(By.linkText("Gear")).click();
	}
	
	//  testing the Training section function

	@Test(priority=5)
	public void trainingSection() {
		System.out.println("Verify the training section");
		driver.findElement(By.linkText("Training")).click();
		
	}
	
	// sales the Gear section function

	@Test(priority=6)
	public void saleSection() {
		System.out.println("Verify teh sale section");
		driver.findElement(By.linkText("Sale"));
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}

}
