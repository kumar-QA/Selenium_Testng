package HandlingAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class normalAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
