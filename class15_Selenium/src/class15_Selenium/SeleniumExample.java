package class15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='global-search-input']")).sendKeys("Camera");
		driver.findElement(By.xpath("//button[@id='global-search-submit']")).click();
		driver.findElement(By.xpath("//button[@id='hf-account-flyout']")).click();
	}

}
