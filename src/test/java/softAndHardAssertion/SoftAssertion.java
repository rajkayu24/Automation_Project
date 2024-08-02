package softAndHardAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	// Soft Assertion =if any st fails even though it will continue executing next
	// st.// syntax:-
	// SoftAssert softAssert=new SoftAssert();
     // softAssert.assertTrue(condition);
      //softAssert.assertAll();
	
	//NOTE:-if here we take only one softAssert class ref for both methods than 
	//if softAssertionTest1() fails than second method i.e. softAssertionTest2() 
	//also will fail even thogh it is right so because of this reason we take two separate softAssert
	//class ref but in case of -if softAssertionTest1() pass and 2 nd softAssertionTest2() fail than it will hppily
	//  show 1 st pass and 2nd fail using same softAssert ref
	

	SoftAssert softAssert1 = new SoftAssert();
	SoftAssert softAssert2 = new SoftAssert();

	@Test
	public void softAssertionTest1() {

		softAssert1.assertEquals(false, false);

		softAssert1.assertEquals("welcome", "welcome");
		
		
		softAssert1.assertAll();
	}

	@Test
	public void softAssertionTest2() {
		softAssert2.assertTrue(false);// it will pass
		// softAssert.assertTrue(false);//it will fail

		System.out.println("test passed");
		softAssert2.assertAll();
	}
}
