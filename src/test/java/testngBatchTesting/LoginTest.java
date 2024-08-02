package testngBatchTesting;

import org.testng.annotations.Test;

public class LoginTest {
	@Test(priority = 0)
	public void login() {
		System.out.println("this is login ");
	}

	@Test(priority = 1)
	public void verifyhomepage() {
		System.out.println("home page");
	}

}
