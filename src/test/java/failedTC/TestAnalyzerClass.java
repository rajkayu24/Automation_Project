package failedTC;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestAnalyzerClass implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		int retrylimit = 3;
		int count = 0;
		if (count < retrylimit) {
			System.out.println("Retrying..." + result.getName());
			
		}
		return false;
	}

}
