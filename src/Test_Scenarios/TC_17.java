//Verify that user is able to see the reviews
package Test_Scenarios;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_17 {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\Shiks\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String Url = "https://magento.softwaretestingboard.com/";
		driver.get(Url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id = 'search']")).sendKeys("Bag");
		driver.findElement(By.xpath("//button[@title=\"Search\"]")).click();
		driver.findElement(By.linkText("Push It Messenger Bag")).click();
		driver.findElement(By.xpath("//a[@class=\"action view\"]")).click();
		}

}
