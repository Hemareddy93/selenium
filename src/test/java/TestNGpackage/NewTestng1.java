package TestNGpackage;

import org.testng.annotations.Test;

public class NewTestng1 extends NewTestng  {
  @Test
  public void elephant() {
	  driver.get("https://www.amazon.com/");
	  System.out.println("i am an elephant");
  }
}
