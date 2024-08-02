package testngBatchTesting;

import org.testng.annotations.Test;

public class LogoutTest {
	@Test(priority=0)
	public void logout() {
		System.out.println("this is logout");
	}
	
	@Test(priority=1)
	public void log() {
		System.out.println("i am log");
	}
}
