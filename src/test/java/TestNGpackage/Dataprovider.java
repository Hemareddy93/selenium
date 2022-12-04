package TestNGpackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	private static WebDriver driver;

	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {
		// The number of times data is repeated, test will be executed the same no. of
		// times
		// Here it will execute two times
		return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_2", "Test@1234" } };
	}

	// Here we are calling the Data Provider object with its Name
	@Test(dataProvider = "Authentication")
	public void test(String sUsername, String sPassword) {
		System.out.println(sUsername);
		System.out.println(sPassword);
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}
}
