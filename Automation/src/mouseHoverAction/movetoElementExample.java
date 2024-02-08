package mouseHoverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetoElementExample {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	WebElement BLOG=driver.findElement(By.id("blogsmenu"));
WebElement link=driver.findElement(By.xpath("//a[@href=\"http://www.selenium-by-arun.blogspot.com\"]"));
Actions act=new Actions(driver);
act.moveToElement(BLOG).moveToElement(link).click().perform();

	}

}
