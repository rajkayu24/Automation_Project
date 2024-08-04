package testNg_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsDemo {
  @Test
  public void testcase1() {
	  System.out.println("i am testcase1");
  }
  
  @Test
  public void testcase2() {
	  System.out.println("i am testcase2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am beforeMethod which executes before every test method");
  }

  @AfterMethod
  public void afterMethod() {
  
	  System.out.println("i am afterMethod which executes after every test method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am beforeClass which executes once before all  test method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am afterClass which executes once after all test method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am beforeTest which executes once before all test method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am afterTest which executes once after  all test method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("i am beforeSuite which executes once before  all test method");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am afterSuite which executes once after  all test method");
  }

}
