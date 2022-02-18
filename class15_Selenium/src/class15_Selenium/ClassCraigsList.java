package class15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassCraigsList extends Base{

	
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver; 
		
		driver = new ChromeDriver();
		
		driver.get("https://www.craigslist.org");
		
		driver.findElement(By.xpath("//a[text()='my account']")).click();
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("mdtanvirsharif@gmail.com");
		
		
	

}//class
