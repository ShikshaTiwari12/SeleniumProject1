package Test_Scenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_04 {
	public String baseUrl = "https://magento.softwaretestingboard.com/";
	String driverPath = "C:\\Users\\Shiks\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	public WebDriver driver;
	
	
	@BeforeTest
	public void launch() {
		System.out.println("Launching the chrome driver");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	
	@Test()
	
	public void Title() {
		System.out.println("Verifying the title");
		String actualTitle = driver.getTitle();
		System.out.println("Actual title is: " + actualTitle);
		String ExpectedTitle = "Home Page";
		if (actualTitle.equals(ExpectedTitle)){
			System.out.println( "Title is matched");
		}
		else {
			System.out.println("Title is incorrect");
		}
	}
	
	@AfterTest
	public void close() {
		driver.quit();
		
	}
	
	

}
