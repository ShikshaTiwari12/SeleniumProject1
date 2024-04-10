//Verify that user is able to search the product smoothly
package Test_Scenarios;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TC_05 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiks\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		String Url = "https://magento.softwaretestingboard.com/";
		driver.get(Url);
		driver.manage().window().maximize();
		driver.findElement(By.id("search")).sendKeys("Shirt");
	}
	

}
