import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowdemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		WebElement Services = driver.findElement(By.xpath("//div[text()='Services']"));
		
		Services.click();
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String> ChildWindows = driver.getWindowHandles();
		
		Thread.sleep(5000);
		 
		Iterator<String> itr = ChildWindows.iterator();
		
		while(itr.hasNext()) {
			
			String ChildWin = itr.next();
			
			if(!ChildWin.equals(MainWindow)) {
				driver.switchTo().window(ChildWin);
				
				WebElement KnowMore = driver.findElement(By.xpath("(//div[@class='knowMore'])[1]"));
				
				KnowMore.click();
			}
		}
		
		
		
		
		
		
//		driver.quit();

		
		//		driver.get("https://demo.guru99.com/test/delete_customer.php");
//		
//		WebElement CustId = driver.findElement(By.xpath("//input[@name='cusid']"));
//		CustId.sendKeys("12345");
//		WebElement SubmitBtn = driver.findElement(By.xpath("//input[@name='submit']"));
//		SubmitBtn.click();
//		
//		System.out.println(driver.switchTo().alert().getText());
//		
//		// When we want to click on Cancel Button we use dismiss method
//		driver.switchTo().alert().dismiss();
//		// When we want to click on Ok Button we use accept method
//		SubmitBtn.click();
//		driver.switchTo().alert().accept();
	}

}
