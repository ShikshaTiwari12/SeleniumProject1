//Verify that user is able to log in with valid credential
package Test_Scenarios;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_06 {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromrdriver", "C:\\Users\\Shiks\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String Url = "https://magento.softwaretestingboard.com/";
		driver.get(Url);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys("vtu15477@veltech.edu.in");
		driver.findElement(By.id("pass")).sendKeys("Tiwari#123");
		driver.findElement(By.id("send2")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.quit();

		
		
		
	}

}
