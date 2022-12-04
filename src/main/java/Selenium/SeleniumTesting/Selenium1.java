package Selenium.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium1 {
	public static void main(String[] args) {
		  //Chrome Browser
		  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); //ChromeDriver driver = new ChromeDriver();
		  driver.get("https:\\accounts.google.com");
		  driver.findElement(By.id("identifierId")).sendKeys("trainingselenium2022@gmail.com");
		  //driver.quit();
		  
		  /*//Firefox Browser+

		  System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("https:\\www.gmail.com");
		  driver.quit();
		  
		  //Edge Browser
		  System.setProperty("webdriver.edge.driver","C:\\Drivers\\msedgedriver.exe");
		  driver = new EdgeDriver();
		  driver.get("https:\\www.google.com");
		  driver.quit();*/
		  
	}
	
}

