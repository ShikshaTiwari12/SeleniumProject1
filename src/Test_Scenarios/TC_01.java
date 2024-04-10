package Test_Scenarios;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {
//	Verify the homepage loads successfully.
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiks\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://magento.softwaretestingboard.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

		driver.quit();
		
	}

}
