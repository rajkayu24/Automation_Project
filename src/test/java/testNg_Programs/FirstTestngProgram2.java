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

public class FirstTestngProgram2 {
	public WebDriver driver;
@Test
@Parameters({"browser","url"})
public void tcsetup(String br,String appurl) {
	if(br.equals("chrome")) {
	
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get(appurl);
	
	}else if(br.equals("edge")) {
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
	}
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
}}