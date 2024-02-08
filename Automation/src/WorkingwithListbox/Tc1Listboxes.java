package WorkingwithListbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc1Listboxes {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
			
	WebElement Holiday=driver.findElement(By.id("drop1"));
	
	List<WebElement>values=Holiday.findElements(By.tagName("option"));
	System.out.println("no of Values are"+"  "+values.size());
	
	for(int i=0;i<values.size();i++) {
		String name= values.get(i).getText();
		if(name.equals("doc 2")) {
			 values.get(i).click();
			 System.out.println(values.get(i).getText()+" is active");
			
		}else {
			System.out.println(values.get(i).getText()+" in active");
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
		
		
		
	}

}
