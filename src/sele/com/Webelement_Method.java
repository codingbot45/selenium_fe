package sele.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Method {
	
	 public static void main(String[] args) {
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_feb\\src\\sele\\com\\Webelement_Method.java" );
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.instagram.com/");
		 
		 WebElement username = driver.findElement(By.id("email"));
		 username.sendKeys("ram");
		 
		
	}

}
