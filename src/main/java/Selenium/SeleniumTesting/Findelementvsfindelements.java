package Selenium.SeleniumTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Findelementvsfindelements {
	
	public static void main(String[] args) throws InterruptedException {
		  //Chrome Browser
		  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); //ChromeDriver driver = new ChromeDriver();
		  //driver.get("https://phptravels.com/demo/");
		  //driver.get("https://demoqa.com/text-box");
		  driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		  driver.manage().window().maximize();
			/*
			 * Select select= new
			 * Select(driver.findElement(By.cssSelector("#searchDropdownBox")));
			 * select.selectByVisibleText("Alexa Skills"); select.selectByIndex(2);
			 * select.selectByValue("search-alias=amazon-pharmacy");
			 * 
			 * List<WebElement> items= select.getOptions(); String i=
			 * items.get(0).toString(); System.out.println(i);
			 */
		  //mouse actions
		  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		   Actions obj = new Actions(driver);
		   WebElement source= driver.findElement(By.xpath("//ul[@id='gallery']/li[1]/img[contains(@alt,'The peaks of High Tatras')]"));
		   WebElement target= driver.findElement(By.id("trash"));
		   Action image1 = obj.clickAndHold(source).moveToElement(target).release(target).build();
		   image1.perform();
		  //keyboard actions
		 /*  driver.findElement(By.id("userName")).sendKeys("Hema");
		   driver.findElement(By.id("userEmail")).sendKeys("hemareddyn93@gmail.com");
		   driver.findElement(By.id("currentAddress")).sendKeys("fortcollines,colorado,USA");
		   //to select
		   obj.keyDown(Keys.CONTROL);
		   obj.sendKeys("A");
		   obj.keyUp(Keys.CONTROL);
		   obj.build().perform();
		   //COPY
		   obj.keyDown(Keys.CONTROL);
		   obj.sendKeys("C");
		   obj.keyUp(Keys.CONTROL);
		   obj.build().perform();
		   //TAB
		   obj.sendKeys(Keys.TAB);
		   obj.build().perform();
		   //paste
		   obj.keyDown(Keys.CONTROL);
		   obj.sendKeys("V");
		   obj.keyUp(Keys.CONTROL);
		   obj.build().perform();
		   */
		   //mouse actions
			/*
			 Thread.sleep(3); WebElement source= driver.findElement(By.id("column-a"));
			 * WebElement target= driver.findElement(By.id("column-b")); Thread.sleep(3);
			 * obj.moveToElement(target); obj.clickAndHold(target);
			 */
		  // obj.dragAndDrop(source,target).build().perform();
		 
		   
		   
		   
		   
				   
		  
		  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  //driver.findElement(By.id("identifierId")).sendKeys("trainingselenium2022@gmail.com");
		  //create account button
		  
		 //driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-dgl2Hf ksBjEc lKxP2d LQeN7 FliLIb uRo0Xe TrZEUc Xf9GD']")).click();
		  
		  //forgot email
		  
		  
		  //driver.findElement(By.xpath("//button[@jsname='Cuz2Ue']")).click();
		  
		  //learnmore
		  
		  //driver.findElement(By.xpath("//a[@jsname='JFyozc']")).click();
		  
		  //select country
		  
		  //driver.findElement(By.xpath("//div[@jsname='wSASue']")).click();
		  
		  //help   privacy  terms
		  //driver.findElement(By.linkText("Help")).click();
		  //driver.findElement(By.linkText("Privacy")).click();
		  //driver.findElement(By.linkText("Terms")).click();
		  //driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts?hl=en-US&p=account_iph']")).click();
		  //driver.findElement(By.xpath("//a[@href='https://accounts.google.com/TOS?loc=US&hl=en-US&privacy=true']")).click();
		  //driver.findElement(By.xpath("//a[@href='https://accounts.google.com/TOS?loc=US&hl=en-US']")).click();
		 		  		  
		  //next
		  
		   //driver.findElement(By.id("identifierNext")).click();
		  
		  //password
		  //Thread.sleep(5000);
		  //driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Selenium@2022");
		  //Thread.sleep(5000);
		  //driver.findElement(By.xpath("//input[@autocomplete='current-password'")).sendKeys("Selenium@2022");
		  
		 // driver.findElement(By.xpath("//div[@class='rFrNMe ze9ebf YKooDc wIXLub zKHdkd sdJrJc']")).sendKeys("Selenium@2022");
		  		 
		  //driver.quit();
		  
		  //Xpath Syntax
		  //tagName[@attributename='attributevalue']
		  //*[@attributename='attributevalue'] *-all (fetches attribute values independent of tagName)
		  
		  //Xpath -contains() Syntax
		  //*[contains(@attributeName, 'attraibuteValue')] // Used for dynamic webelements - If partial value of attribue is changing the
		 // we cann go with standard part of attribute using contains
		  
		  //Xpath - starts-with() Syntax
		  //*[starts-with(@attributeName, 'attraibuteValue')]
		  
		 // Xpath - text() syntax
		  //*[text()='value']
		  //*[contains(@text(),'value'] ***
		  
		  //Xpath - following, Ancestor, Child,Parent, Self, following-siblings, preceding
		  
		//*[@class='V7i3mf']//following::ul[2]
		  
		//*[@id='logo']//ancestor::div[1

		//*[@id='logo']//child::div[1]
		  
		//*[@id='logo']//parent::div[1]    ---------wromg
		  
		//*[@id='headingText']//following-sibling::div
		  
		//*[@id='headingSubtext']//preceding::h1
		  
		//*[@id='headingSubtext']//self::div
		  
		  
		  

}
}
