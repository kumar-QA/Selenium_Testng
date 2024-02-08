package workinhwithImages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNoOfImages {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
	List<WebElement>images=driver.findElements(By.tagName("img"));
	System.out.println("no of images is: "+images.size());
	
	for (int i = 0; i < images.size(); i++) {
		
		System.out.println(images.get(i).getAttribute("src"));
	}
		
		
		
	}

}
