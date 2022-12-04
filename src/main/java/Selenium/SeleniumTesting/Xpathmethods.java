package Selenium.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https:\\accounts.google.com");
        //driver.Maximize().
        
        /* //Xpath with * and with tagname
      	  //tagName[@attributename='attributevalue']
		  //*[@attributename='attributevalue'] *-all (fetches attribute values independent of tagName)*/
		  
                 //driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("abcdfghhjfd");
                // driver.findElement(By.xpath("//input[@name='identifier']"));
       /* //Xpath -contains() Syntax
		  //*[contains(@attributeName, 'attraibuteValue')] // Used for dynamic webelements - If partial value of attribue is changing the
		 // we cann go with standard part of attribute using contains*/
        
               // driver.findElement(By.xpath("//button[contains(@jsname, 'Cuz')]")).click();
               // driver.findElement(By.xpath("//*[contains(@jsname, 'Cuz')]")).click();
        /*//Xpath - starts-with() Syntax
		  //*[starts-with(@attributeName, 'attraibuteValue')]*/
        
               //driver.findElement("//*[starts)
       /*// Xpath - text() syntax
		  //*[text()='value']
		  //*[contains(@text(),'value')] ***/
             
             //driver.findElement(By.xpath("//*[text( ) ='Create account']")).click();
             //  driver.findElement(null)---------------------------
        /* //Xpath - following, Ancestor, Child,Parent, Self, following-siblings, preceding */
        //Following
        
        
		  
        
        
        
      
	}

}
