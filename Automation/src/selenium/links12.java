package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links12 {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/indian-holidays");
		
		
	WebElement Duration=driver.findElement(By.id("duration_d"));
	
	List<WebElement>values=Duration.findElements(By.tagName("option"));
	
	for(int i=0;i<values.size();i++) {
		
		               values.get(i).click();
		               
		     if(values.get(i).isDisplayed()) {
		    	 System.out.println("TC Pass");
		     }
		     else {
		    	 System.out.println("Tc Fail");
		     }
		
	}
	
	
		
		
		
	}

}

