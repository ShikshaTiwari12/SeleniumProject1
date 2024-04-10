//Verify that user is able to place the order.

package Test_Scenarios;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import pageobjectmodel.Loginpage;

import org.testng.Assert;

public class TC_12 {
	public String Url = "https://magento.softwaretestingboard.com/";
	String driverPath = "C:\\Users\\Shiks\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver;
	@BeforeTest
	public void launch() {
		System.out.println("Launching the browser");
		Loginpage login;
		WebDriver driver;
		}
	
	@Test(priority =1)
	public void Lumalogin() {
		System.setProperty("webdriver.driver.chromedriver", driverPath);
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		Loginpage page = new Loginpage(driver);
		page.EnterDetails();
	}
	@Test(priority = 2)
	public void addProductToCart() {
		System.out.println("Enter the details in searchbox");
		driver.findElement(By.id("search")).sendKeys("Shirt");
		driver.findElement(By.xpath("//button[@title=\"Search\"]")).click();
		driver.findElement(By.cssSelector("a.product-item-link")).click();
		driver.findElement(By.xpath("//div[@id='option-label-size-143-item-167']")).click();;
		driver.findElement(By.id("option-label-color-93-item-50")).click();
		driver.findElement(By.xpath("//input[@value='1']"));
		driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		driver.findElement(By.linkText("View and Edit Cart")).click();

		
	}
	@Test(priority = 3)
	public void checkOutPage() {
		System.out.println("proceed to checkout");
		WebElement PTC = driver.findElement(By.xpath("//ul[@class='checkout methods items checkout-methods-items']"));
		PTC.click();
	}
	
	@Test(priority = 4)
	public void shippingInformation() {
		System.out.println("Fill the details");
		driver.findElement(By.xpath("//input[@name='street[0]']")).sendKeys("Indiagate");
		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("Delhi");
		Select drpCountry = new Select(driver.findElement(By.name("country_id")));
		drpCountry.selectByVisibleText("India");
		Select drpRegion = new Select(driver.findElement(By.name("region_id")));
		drpRegion.selectByVisibleText("Delhi");
		driver.findElement(By.xpath("//input[@name = 'postcode']")).sendKeys("123456");
	    driver.findElement(By.name("telephone")).sendKeys("1234567890");

	    driver.findElement(By.xpath("//button[@class=\"button action continue primary\"]")).click();
	    driver.findElement(By.xpath("//input[@name='billing-address-same-as-shipping']"));
	    driver.findElement(By.xpath("//button[@title=\"Place Order\"]")).click();
	}
	    
	@AfterTest
	public void close() {
		driver.quit();
	
		
	}
}