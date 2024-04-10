// Verify that user is able to delete the product from wishlist.

package Test_Scenarios;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;

import pageobjectmodel.Loginpage;


public class TC_16 {
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
	public void addToWishList() {
		driver.findElement(By.id("search")).sendKeys("Shirt");
		driver.findElement(By.xpath("//button[@title=\"Search\"]")).click();
		driver.findElement(By.cssSelector("a.product-item-link")).click();
		driver.findElement(By.xpath("//div[@id='option-label-size-143-item-167']")).click();;
		driver.findElement(By.id("option-label-color-93-item-50")).click();
		driver.findElement(By.xpath("//input[@value='1']"));
		driver.findElement(By.xpath("//a[@class='action towishlist']")).click();
		System.out.println("The product has been added to your Wish List");
		driver.findElement(By.linkText("product-image-photo")).click();
        driver.findElement(By.xpath("//a[@data-role='remove']")).click();
      
       
		
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
	

}
