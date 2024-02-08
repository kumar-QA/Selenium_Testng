package workingWithCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class countOfCheckbox {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		int count=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println("no of radio btn is  "+count);

	}

}
