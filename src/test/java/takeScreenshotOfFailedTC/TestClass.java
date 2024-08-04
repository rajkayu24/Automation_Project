package takeScreenshotOfFailedTC;

	import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//@Listeners(ListenerClass.class)
public class TestClass extends BaseClass {
		@BeforeMethod
		public void setup() {
			launchbrowser();
			
		}

		@AfterMethod
		public void teardown() {
			driver.quit();
			}

		@Test
		public void screenshotTest4() {
			
			Assert.assertEquals(false,true);	
		}
		

		@Test
		public void screenshotTest2() {
			
			Assert.assertEquals(false,true);	
		}
		}
