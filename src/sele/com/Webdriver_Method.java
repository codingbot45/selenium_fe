package sele.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Method {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_feb\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//get
		driver.get("https://www.facebook.com/");
		
		//gettitle()
		String title=driver.getTitle();
		System.out.println(title);
		
		//getcurrenturl
		
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		//getpagesource
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		
		
		
		
		
		
		
	}

}
