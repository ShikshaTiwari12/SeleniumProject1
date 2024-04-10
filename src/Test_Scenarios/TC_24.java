// Verify the login page with wrong password

package Test_Scenarios;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_24 {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "C\\Users\\Shiks\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		 driver.findElement(By.linkText("Sign In")).click();
		 driver.findElement(By.id("email")).sendKeys("vtu15477@veltech.edu.in");
		 driver.findElement(By.id("pass")).sendKeys("1234567");
		 driver.findElement(By.id("send2")).click();
		 driver.quit();
	}

}
