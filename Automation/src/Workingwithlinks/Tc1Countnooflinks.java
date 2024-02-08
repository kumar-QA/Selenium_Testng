package Workingwithlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc1Countnooflinks {

	public static void main(String[] args) {

		//open browser Navigate to Flipkart
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++) {
			
			String lname=links.get(i).getText();
			              links.get(i).click();
			String url=driver.getCurrentUrl();
			System.out.println(lname+"  "+url);
			
			driver.navigate().back();
			driver.findElements(By.tagName("a"));
		}
		
		
		
		
		
		
	}

}
