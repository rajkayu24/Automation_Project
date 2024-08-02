package testNg_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestngProgram {
	public WebDriver driver;
@Test
@Parameters({"browser"})
public void tcsetup(String br) {
	if(br.equals("chrome")) {
	
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
	}else if(br.equals("edge")) {
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
	}
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
}}