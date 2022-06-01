package sele.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Up_Down {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_feb\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Amazon.com/");
		
		WebElement img = driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		js.executeScript("window.scroll(0,1000)", "");
		
//		Thread.sleep(2000);
		
//		js.executeScript("window.scroll(0,0)", "");
		
		
		Thread.sleep(2000);
	
		js.executeScript("argument[0].scrollintoview(true);",img);
		
		
		
		
		
		
	}
	
	

}
