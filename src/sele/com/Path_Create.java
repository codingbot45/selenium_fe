package sele.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Path_Create {
	
	public static void main(String[] args) {
		
      System.setProperty("webdriver.Chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_feb\\driver\\chromedriver.exe");
      
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://www.facebook.com/");
         
        WebElement username = driver.findElement(By.xpath(""));
		
	}

}
