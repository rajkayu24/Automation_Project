package softAndHardAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

//Hard assertion=if any st fails than it will stop executing next st.

//we mainly use 3 statements in hard assertion 
//Assert.assertTrue()
//Assert.assertFalse()
//Assert.assertEquals()
public class HardAssertion {
@Test
public void  hardAssertionTest() {
Assert.assertEquals(false, false);

Assert.assertEquals("welcome","welcome");
Assert.assertEquals("sheetal","sheetal");

Assert.assertTrue(true);//it will pass
Assert.assertTrue(false);//it will fail

Assert.assertFalse(false);//it will pass
Assert.assertFalse(true);//it will fail

} 
}
