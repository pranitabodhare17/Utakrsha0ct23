package TestNGPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Welcome to PVG Nashik");
  }
  @Test
  public void s() {
	  System.out.println("Welcome to Future Fold Software Pune");
	  Assert.assertEquals("Google", "google");
  }
}
