package sele.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_feb\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/men-casual-shirts");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		List<WebElement> prod = driver.findElements(By.xpath("//span[@class='product-strike']/preceding-sibling::span"));
		
		for (int i = 0; i < prod.size(); i++) {
			
			String replace = prod.get(i).getText().replace("Rs. ", "");
			System.out.println(replace);
			int parseInt = Integer.parseInt(replace);
			list.add(parseInt);
			
		}
			
			System.out.println("size is ="+list.size());
			System.out.println("Maximum offer price = "+Collections.max(list));
			
			
			
			
			
			
			
			
			
		}
		
		
	}


