package sele.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selectors_Concept {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_feb\\driver\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 WebElement username = driver.findElement(By.cssSelector("[placeholder^='Email']"));
		 
		 username.sendKeys("rohitram");
		 
		 WebElement login = driver.findElement(By.cssSelector("button[name='login']"));
		 
		 login.click();
		 
		 
		 
		
	}

}
