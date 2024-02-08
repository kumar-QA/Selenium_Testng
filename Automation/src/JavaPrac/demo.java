package JavaPrac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
 static int c;
public static void main(String[] args) throws InterruptedException {
	
	
	//open browser Nvaigate to Webpage
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	driver.manage().window().maximize();
	
	
	/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.linkText("Dynamic Loading")).click();
	driver.findElement(By.partialLinkText("Example 2: ")).click();
	
	driver.findElement(By.tagName("button")).click();*/
	
	
	String data=driver.findElement(By.xpath("(//h4)[2]")).getText();
	System.out.println(data);
}
}
