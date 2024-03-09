import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//	WebElement SearchBox = driver.findElement(By.xpath("//textarea[@aria-label='Search']")); 
		WebElement SearchBox = driver.findElement(By.cssSelector("textarea[aria-label='Search']")); 

		SearchBox.sendKeys("PVG Nashik");
		// Navigation Commands (Back, Forward, Refresh, to) Navigation command store the history.
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().back();
		WebElement CreateNewAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		CreateNewAcc.click();
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Ravi");
		//driver.quit();
	}

}
