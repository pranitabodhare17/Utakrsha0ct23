package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class AnnotationTest {
	public WebDriver driver;
  @Test
  public void StartFB() {
	  driver.get("https://www.facebook.com");
  }
  @Test
  public void StartInsta() {
	  driver.get("https://www.instagram.com");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  System.out.println("Before Method will execute before Every Test Annotation and it will execute before every Test");

  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  System.out.println("After Method will execute after Every Test Annotation and it will execute after every Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite will execute before First Test Annotation and it will execute Single Time");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test will execute Before First Test but 2nd priority Annotation and it will execute Single Time");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class will execute before First Test but 3rd priority Annotation and it will execute Single Time");
  }
  
  
  
}
