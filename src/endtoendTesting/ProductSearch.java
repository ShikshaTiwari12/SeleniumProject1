package endtoendTesting;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class ProductSearch {
	public String baseUrl = "https://magento.softwaretestingboard.com/";
	String driverPath = "C:\\Users\\Shiks\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	public WebDriver driver;
	
	@BeforeTest
	// TC_01 Verify the homepage loads successfully.
	public void launch() {
		System.out.println("Launcing the chrome browser");
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
	}
	 
	
	@Test(priority=1)
	// TC_03testing the login functionality
	
	public void login() {
		System.out.println("Signing In the website");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys("vtu15477@veltech.edu.in");
		driver.findElement(By.id("pass")).sendKeys("Tiwari#123");
		driver.findElement(By.id("send2")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	// TC_04 Verify the product search functionality
		driver.findElement(By.id("search")).sendKeys("shirt");
		driver.findElement(By.xpath("//button[@title='Search']")).click();
	// TC_05	Verify that search results are displayed.
		driver.findElement(By.cssSelector("a.product-item-link")).click();
	// TC_06 verifying the choosing color, size and quantity functionality	
		driver.findElement(By.xpath("//div[@id='option-label-size-143-item-167']")).click();;
		driver.findElement(By.id("option-label-color-93-item-50")).click();
		driver.findElement(By.xpath("//input[@value='1']"));
	// TC _07 Add the product to the cart 

		driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();

		}
//		
		
	@Test(priority=2)
	
	public void checkout() throws InterruptedException {

		System.out.println("Procced to checkout");
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();

		driver.findElement(By.xpath("//button[@id=\"top-cart-btn-checkout\"]")).click();
		
		// TC_10 Fill in shipping information on the checkout page.
		driver.findElement(By.xpath("//input[@name='street[0]']")).sendKeys("Excelr");
		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("Pune");

		Select drpCountry = new Select(driver.findElement(By.name("country_id")));
		drpCountry.selectByVisibleText("India");
		Select drpRegion = new Select(driver.findElement(By.name("region_id")));
		drpRegion.selectByVisibleText("Maharashtra");
		
	
		driver.findElement(By.xpath("//input[@name = 'postcode']")).sendKeys("123456");
	    driver.findElement(By.name("telephone")).sendKeys("1234567890");
	    Thread.sleep(1000);
	    // TC_11 Select a shipping method and proceed to payment.


	    driver.findElement(By.xpath("//button[@class=\"button action continue primary\"]")).click();
	    driver.findElement(By.xpath("//input[@name='billing-address-same-as-shipping']"));
	    driver.findElement(By.xpath("//button[@title=\"Place Order\"]")).click();
	    

	
	}
	
	@AfterTest()
	public void orderCompleted() {
		System.out.println("Your order is completed");
		driver.quit();
		}
		
		
		
		
	}
	
	
			

