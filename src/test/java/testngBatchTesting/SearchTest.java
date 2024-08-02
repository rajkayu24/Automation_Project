package testngBatchTesting;

import org.testng.annotations.Test;

public class SearchTest {
	@Test(priority=0)
	public void logout() {
		System.out.println("this is logout");
	}

@Test(priority=1)
public void st() {
	System.out.println("this is st");
}

}
