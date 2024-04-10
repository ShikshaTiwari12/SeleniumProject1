//Verify that user is able to submit the review smoothly.
package Test_Scenarios;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;

import pageobjectmodel.Loginpage;


public class TC_19 {
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
	public void addReview() {
		driver.findElement(By.xpath("//input[@id = 'search']")).sendKeys("Bag");
		driver.findElement(By.xpath("//button[@title=\"Search\"]")).click();
		driver.findElement(By.linkText("Push It Messenger Bag")).click();
		driver.findElement(By.linkText("Add Your Review")).click();
		driver.findElement(By.xpath("//label[@class=\"rating-1\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"summary_field\"]")).sendKeys("Quality issue");
		driver.findElement(By.xpath("//textarea[@id=\"review_field\"]")).sendKeys("The quality of the bag is not good.");
		driver.findElement(By.xpath("//button[@class=\"action submit primary\"]")).click();
		
	}
	@AfterTest
	public void close() {
		driver.quit();
	}
}
	