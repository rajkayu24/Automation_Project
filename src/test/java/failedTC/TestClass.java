package failedTC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
@Test(priority=0)
public void m1() {
	System.out.println("i am m1");
	Assert.assertTrue(true);
}
@Test(priority=1)
public void m2() {
	System.out.println("i am m2");
Assert.assertTrue(false);
}

}
