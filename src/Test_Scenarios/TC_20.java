package Test_Scenarios;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;

import pageobjectmodel.Loginpage;


public class TC_20 {
	public String Url = "https://magento.softwaretestingboard.com/";
	String driverPath = "C:\\Users\\Shiks\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver;
	
	public void launch() {
		System.out.println("launching the browser");
		Loginpage login;
		WebDriver driver;
		
	}
	
	@Test
	public void LumaLogin() {
		System.setProperty("webdriver.driver.chromedriver", driverPath);
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		Loginpage page = new Loginpage(driver);
		page.EnterDetails();
	}
	@Test
	public void footerOptions() {
        driver.findElement(By.linkText("Search Terms")).click();
        driver.findElement(By.linkText("Privacy and Cookie Policy")).click();
        driver.findElement(By.linkText("Advanced Search")).click();
	}
	
	@AfterTest
	public void close() {
		driver.quit();
		
	}
}