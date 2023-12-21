package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsserationsExampe {

	@Test
	public void login() {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
	WebElement uname=driver.findElement(By.id("Email"));
	uname.clear();
	uname.sendKeys("admin@yourstore.com");
	WebElement pwd=driver.findElement(By.id("Password"));
	pwd.clear();
	pwd.sendKeys("admin");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String ExpectedValue="Dashboard page";
	String actualvalue=driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
//	Assert.assertEquals(actualvalue, ExpectedValue);
//	Assert.assertTrue(ExpectedValue.equals(actualvalue));
	
	SoftAssert s=new SoftAssert();
	s.assertEquals(actualvalue, ExpectedValue);
	
	System.out.println("hi");
	s.assertAll();
	System.out.println("hello");
	
	
	}
	
	
	
}
