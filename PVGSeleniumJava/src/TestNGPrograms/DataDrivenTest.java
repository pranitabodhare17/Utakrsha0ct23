package TestNGPrograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class DataDrivenTest {
	public WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com");
	  }
  @Test(dataProvider = "dp")
  public void Login(String UserName, String PassWord) {
	  WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	  username.sendKeys(UserName);
	  password.sendKeys(PassWord);
	  LoginBtn.click();
	  String Title = driver.getTitle();
	  String ExpectedTitle = "Facebook";
	  Assert.assertEquals(Title, ExpectedTitle);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "ravinangre123", "PassW0rd123" },
      new Object[] { "ravipvg", "Qwerty@123" },
      new Object[] { "utkarshaa12", "qwerty@123" },
    };
  }
}
