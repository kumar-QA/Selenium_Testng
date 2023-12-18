import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
public class HandelScreenhot {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("vdfbrgbr");
		driver.findElement(By.id("password")).sendKeys("dfgrge");
		driver.findElement(By.id("submit")).click();
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("D:\\Screenshots\\proof.png"));
	}

}
