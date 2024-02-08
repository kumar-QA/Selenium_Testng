package workingwihradioBtn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stausoftheRadioBtn {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> ele=driver.findElements(By.xpath("//input[@type='radio']"));
		
		for (int i = 0; i <ele.size(); i++) {
			System.out.println(ele.get(i).getAttribute("checked"));
		}
	}

}
