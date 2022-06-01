package sele.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_Concept {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_feb\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("single frame");
		
		Thread.sleep(1000);
		
		
		WebElement single = driver.findElement(By.xpath("//input[@type='text']"));
		single.sendKeys("selenium");
		
		
		
		
		
		
		
	}

}
