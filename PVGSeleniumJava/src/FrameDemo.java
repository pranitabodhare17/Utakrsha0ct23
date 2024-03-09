import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.switchTo().frame("a077aa5e");
		WebElement JmeterImg = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		JmeterImg.click();
		
//		WebElement YoutubeFrame = driver.findElement(By.xpath("//iframe[contains(@src,'youtube')]"));
//		driver.switchTo().frame(YoutubeFrame);
		
//		WebElement PlayBtn = driver.findElement(By.xpath("//button[@aria-label='Play']"));
//		PlayBtn.click();
	}

}
