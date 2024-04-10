package pageobjectmodel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	
	public Loginpage (WebDriver driver) {
		this.driver = driver;
	}
	 By signin  = By.linkText("Sign In");
	 By user_name = By.id("email");
	 By Password = By.id("pass");
	 By submit = By.id("send2");
	 
	 public void EnterDetails () {
		 driver.findElement(signin).click();
		 driver.findElement(user_name).sendKeys("vtu15477@veltech.edu.in");
		 driver.findElement(Password).sendKeys("Tiwari#123");
		 driver.findElement(submit).click();
		 
		 		
	 }
}
