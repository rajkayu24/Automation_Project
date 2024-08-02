package testNg_Programs;




	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;

	import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.AfterSuite;

	public class NewTest1 {
	 
		 @Test(groups="sanity")
		  public void login() {
		
			  System.out.println("this is login");
			Assert.assertTrue(false);
		 }
		
		
		@Test(priority=0,groups="sanity")
	  public void search() {
	  System.out.println("this is search");
	  Assert.assertTrue(true);
	  }

	  @Test(priority=1,groups="regression")
	  public void advsearch() {
	  System.out.println("this is advsearch");
	  Assert.assertTrue(true);
	  
	  }
	  @Test(groups="sanity")
	  public void logout() {
	  
		  System.out.println("this is logout");
		  Assert.assertTrue(false);
	  }
	  
	  @Test(groups="smoke")
	  public void registration() {
	 System.out.println("this is registration ");
	 Assert.assertTrue(false);
	  }

	  @AfterClass(groups="regression")
	  public void afterClass() {
	  System.out.println("this is aftre class");
	  Assert.assertTrue(true);
	  }

	  @Test(groups="smoke")
	  public void m1test() {
	  System.out.println("this is before test");
	  Assert.assertTrue(true);
	  }

	  @Test(groups="regression")
	  public void m2Test() {
	  System.out.println("this is after test");
	  Assert.assertTrue(true);
	  }

	  @BeforeSuite(groups="sanity")
	  public void beforeSuite() {
	  System.out.println("this is before suit");
	  Assert.assertTrue(true);
	  }

	  @AfterSuite(groups="regression")
	  public void afterSuite() {
	   System.out.println("this is after suit");
	   Assert.assertTrue(true);
	  }

	}


