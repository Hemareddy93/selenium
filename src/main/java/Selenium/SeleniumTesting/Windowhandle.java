package Selenium.SeleniumTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        driver.switchTo().frame("iframeResult");
      //  driver.findElement(By.linkText("Visit W3Schools.com!")).click();
        JavascriptExecutor js= (JavascriptExecutor)driver;
        WebElement w3schools=driver.findElement(By.linkText("Visit W3Schools.com!"));
        js.executeScript("arguments[0].click();",w3schools);
		
		  Set<String> WindowHandles=driver.getWindowHandles(); List<String>
		  WindowHandleslist= new ArrayList<>(WindowHandles);
		  System.out.println(WindowHandleslist.size());
		 
		/*
		 * driver.switchTo().newWindow(WindowType.TAB);
		 * driver.switchTo().newWindow(WindowType.WINDOW);
		 */
		  driver.switchTo().window(WindowHandleslist.get(1));
		  driver.findElement(By.id("search2")).sendKeys("hema");
		 
	}

}
