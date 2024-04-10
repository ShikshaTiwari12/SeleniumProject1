// Verify that user is able to clear the Searchbox after wrong input
package Test_Scenarios;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;

import pageobjectmodel.Loginpage;


public class TC_21 {
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
	public void SearchandClear() throws InterruptedException {
        WebElement searchBoxElement = driver.findElement(By.id("search"));
        searchBoxElement.sendKeys("abz");
        Thread.sleep(2000);
        searchBoxElement.clear();
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
}