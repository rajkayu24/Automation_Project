package testNg_Programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest5 {
	 @Test(groups="sanity")
	  public void login() {
	
		  System.out.println("this is login");
		  ; 
	  
	 }
	
	
	@Test(priority=0,groups="sanity")
public void search() {
System.out.println("this is search");
}

@Test(priority=1,groups="regression")
public void advsearch() {
System.out.println("this is advsearch");
}
@Test(groups="sanity")
public void logout() {

	  System.out.println("this is logout");
}

@Test(groups="smoke")
public void beforeClass() {
System.out.println("this is beforeclass ");
}

@AfterClass(groups="regression")
public void afterClass() {
System.out.println("this is aftre class");
}

@Test(groups="smoke")
public void beforeTest() {
System.out.println("this is before test");
}

@Test(groups="regression")
public void afterTest() {
System.out.println("this is after test");
}

@BeforeSuite(groups="sanity")
public void beforeSuite() {
System.out.println("this is before suit");
}

@AfterSuite(groups="regression")
public void afterSuite() {
 System.out.println("this is after suit");
}

}

