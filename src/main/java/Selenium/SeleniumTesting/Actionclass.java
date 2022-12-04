package Selenium.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); //ChromeDriver driver = new ChromeDriver();
		  
		 /* //mouse actions
		  //switching to iframes 
		  //Drag and Drop
		  driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		  driver.manage().window().maximize();
		  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		  Actions action= new Actions(driver);
		  WebElement source= driver.findElement(By.xpath("//ul[@id='gallery']/li[1]"));
		  WebElement target= driver.findElement(By.id("trash"));
		  action.dragAndDrop(source, target).perform();*/
		 //drag and drop by offset
		  
		  
		  //move to element
		// Locate the element A by By.xpath. 
		  driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		  driver.manage().window().maximize();
		  // Create an object of actions class and pass reference of WebDriver as a parameter to its constructor. 
		  Actions actions = new Actions(driver);
			
			/*
			 * WebElement titleA = driver.findElement(By.xpath("//li[text()= 'A']"));
			 * WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']"));
			 * 
						 * 
			 * // Call moveToElement() method of actions class to move mouse cursor to a
			 * WebElement A. actions.moveToElement(titleA); actions.clickAndHold();
			 * 
			 * actions.moveToElement(titleC); actions.release().perform();
			 */
		   
 // click and hold
	/*
	 * action.moveToElement(titleA);
	 *  action.clickAndHold().perform();
	 */
		  //context click 
			/*
			 * WebElement titleA = driver.findElement(By.xpath("//li[text()= 'A']"));
			 * actions.contextClick(titleA).perform();
			 */
		  WebElement doubleclick= driver.findElement(By.xpath("//*[text( ) ='Sign in with Google']"));
		  actions.doubleClick(doubleclick).perform();
		  
	}

}
