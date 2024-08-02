  package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleHiddenElement {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	
	//clicking on Hide button
	 driver.findElement(By.id("hide-textbox")).click();
	
	 //handle hidden textbox elelement using javascriptExecutor
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('displayed-text').value='selenium';");
	//in abaove st we gave the id of textbox inside the getElementById()
	String s=(String)js.executeScript("return document.getElementById('displayed-text').value");
	System.out.println("value entered in hidden field:"+s);
	}

}
