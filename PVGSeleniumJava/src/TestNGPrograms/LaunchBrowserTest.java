package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchBrowserTest {
	public WebDriver driver;
	@Test(priority = 1)
	public void Edge() {
		  driver = new EdgeDriver();
		  driver.get("https://www.facebook.com");
	  }
	@Test(priority = 2)
	public void Chrome() {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  WebElement GoogleImage = driver.findElement(By.xpath("//img[@alt='Google']"));
	  Assert.assertTrue(GoogleImage.isDisplayed(), "If Google Image is not displayed");
  }
  
	@Test
	public void Firefox() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.instagram.com");
  }
}
