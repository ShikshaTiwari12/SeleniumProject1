package Test_Scenarios;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_02 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiks\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl= "https://magento.softwaretestingboard.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
//		verify that Sign In and create an account pages opening smoothly
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.linkText("Create an Account")).click();
		
		
}
}