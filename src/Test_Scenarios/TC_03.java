package Test_Scenarios;
import java.util.*;
import org.openqa.selenium.*;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.WebElement;
// End to end testing
public class TC_03 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiks\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver =  new ChromeDriver();

		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();	

//		WebElement signin  =driver. findElement(By.xpath("//li[@class ='authorization-link']"));
//		signin.click();
		WebElement createAccount = driver.findElement(By.linkText("Create an Account"));
		createAccount.click();
		WebElement FirstName = driver.findElement(By.id("firstname"));
		WebElement LastName = driver.findElement(By.id("lastname"));
		WebElement Email = driver.findElement(By.id("email_address"));
		WebElement Pass = driver.findElement(By.id("password"));
		WebElement ConfPass = driver.findElement(By.id("password-confirmation"));
		WebElement createAnAccount = driver.findElement(By.linkText("Create an Account"));

		
		Actions builder = new Actions(driver);
		Action SOA = builder
				.moveToElement(FirstName)
				.click()
				.keyDown(FirstName,Keys.SHIFT)
				.sendKeys(FirstName,"Shiksha")
				.moveToElement(LastName)
				.click()
				.keyDown(LastName,Keys.SHIFT)
				.sendKeys(LastName,"Tiwari")
				.moveToElement(Email)
				.click()
				.keyDown(Email,Keys.SHIFT)
				.sendKeys(Email, "vtu15477@veltech.edu.in")
				.moveToElement(Pass)
				.keyDown(Pass,Keys.SHIFT)
				.sendKeys(Pass,"Tiwar#123")
				.moveToElement(ConfPass)
				.click()
				.keyDown(ConfPass,Keys.SHIFT)
				.sendKeys(ConfPass,"Tiwari#123")
				.moveToElement(createAnAccount)
				.click()
				.build();
		
		SOA.perform();
		
	}

}
