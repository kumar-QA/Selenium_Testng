package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class link5 {

	public static void main(String[] args) throws InterruptedException {
		
	
	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		int nooflink=driver.findElements(By.tagName("a")).size();
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.className("btn")).click();
		
	}

}
