// verify that user is able to add the products in comparison list
package Test_Scenarios;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_14 {
	public static void main(String[] args) {
		System.setProperty("WebDriver.driver.ChromeDriver","C:\\Users\\Shiks\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		System.out.println("Signing In the website");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://magento.softwaretestingboard.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys("vtu15477@veltech.edu.in");
		driver.findElement(By.id("pass")).sendKeys("Tiwari#123");
		driver.findElement(By.id("send2")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.id("search")).sendKeys("Shirt");
		driver.findElement(By.xpath("//button[@title=\"Search\"]")).click();
		driver.findElement(By.cssSelector("a.product-item-link")).click();
		driver.findElement(By.xpath("//div[@id='option-label-size-143-item-167']")).click();;
		driver.findElement(By.id("option-label-color-93-item-50")).click();
		driver.findElement(By.xpath("//input[@value='1']"));
		driver.findElement(By.xpath("//a[@class=\"action tocompare\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.quit();
	}

}
