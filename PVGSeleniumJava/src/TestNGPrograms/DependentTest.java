package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependentTest {
	public WebDriver driver;
  @Test(groups = "e2e")
  public void LaunchChrome() {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
  @Test(groups = "sanity")
	public void GoogleValidation() { 
	  WebElement GoogleImage = driver.findElement(By.xpath("//img[@alt='Google']"));
	  GoogleImage.isDisplayed();
}
}
