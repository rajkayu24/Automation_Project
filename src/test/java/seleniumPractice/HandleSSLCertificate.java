package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSSLCertificate {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
	}

}
