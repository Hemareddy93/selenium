package TestNGpackage;

import org.testng.annotations.Test;
import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestng {
	WebDriver driver;

	@Parameters({ "hema" })
	@Test
	public void testmethod(String name) {

		System.out.println("parameter name" + name);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		System.out.println(driver.getTitle());
		System.out.println("i am Testmethod");
	}

	@Test(groups = { "smoke" })
	public void apple() {
		driver.get("https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/");
		System.out.println(driver.getTitle());
		System.out.println("i am an apple");
	}

	@Test(priority = 0, enabled = false)
	public void dog() {
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getTitle());
		System.out.println("i am a dog");
	}

	@Test(priority = 1, groups = "regression")
	public void cat() {
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		System.out.println("i am a cat");
	}

	@Test(groups = "hema")
	public void ball() {
		try {
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		String applicationTitle = driver.getTitle();
		System.out.println(applicationTitle);
		//Assert.assertEquals(applicationTitle, "Drag and Drop Demo Sites | Testing ", "Expected string was Drag and Drop Demo Sites | Testing Site - GlobalSQA but actual string is" +applicationTitle);
	     Assert.assertTrue(applicationTitle.contains("Drag"), "title displayes as not expected");
	     File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(srcFile, new File("D:\\Screenshot.png"));
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	@BeforeMethod
	public void beforeMethod() {

		//driver = new ChromeDriver();
		System.out.println("i am Before method");
	}

	@AfterMethod
	public void afterMethod() {
		//driver.close();
		System.out.println("i am After method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("i am Before class");
	}

  @AfterClass
  public void afterClass() {
	  System.out.println("i am Afterclass");
  }
   
  @BeforeTest(alwaysRun=true)
  public void beforeTest() {
		
		  driver = new ChromeDriver();
		  System.out.println("i am BeforeTest");
		
  }

  @AfterTest(alwaysRun=true)
  public void afterTest() {
	  driver.quit();
	  System.out.println("i am AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am Aftersuite");
	  System.out.println("i am github");
	  System.out.println("github repositary");
  }

}
