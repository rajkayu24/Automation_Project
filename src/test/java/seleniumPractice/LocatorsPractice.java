package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsPractice {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
	 WebElement un = driver.findElement(By.xpath("//form[@id='form-login']/child::div[1]//input"));
		un.clear();
		un.sendKeys("demo");
		
	 WebElement pass = driver.findElement(By.xpath("//form[@id='form-login']/child::div[2]//input"));
	pass.clear();
	 pass.sendKeys("demo");
	 
	 
	 
	 String t = driver.findElement(By.xpath("//form[@id='form-login']/child::div[3]/child::*")).getText();
	 System.out.println(t);
	 
		
	}
}