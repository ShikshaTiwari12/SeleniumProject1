// Verify that the Website opens in other browser smoothly

package Test_Scenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_25 {
	public static void main(String[] args) {
		 System.setProperty("webdriver.ie.driver", "C:\\Users\\Shiks\\Downloads\\IEDriverServer_x64_4.14.0\\IEDriverServer.exe");
	     InternetExplorerOptions ieOptions = new InternetExplorerOptions();

		 WebDriver driver = new InternetExplorerDriver(ieOptions);
		 driver.get("https://magento.softwaretestingboard.com/");
		 
	

	}
}
