package takeScreenshotOfFailedTC;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test ...." + "-" + result.getName() + "  " + "starts..");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test...." + "-" + result.getName() + "  " + "success..");
	}
  
	@Override
	public void onTestFailure(ITestResult result) {
		 System.out.println("Test is failed");
		  try {
			capturescreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped...." + "-" + result.getName() + "  " + "skipped..");
	}
}
