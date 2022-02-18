package class15_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\java\\driver\\chormedriver.exe");
		
		//execute chrome browser
		WebDriver website;
		website = new ChromeDriver();
		
		//open walmart.com
		website.get("https://www.walmart.com/");
		
		

	}//main

}//class
