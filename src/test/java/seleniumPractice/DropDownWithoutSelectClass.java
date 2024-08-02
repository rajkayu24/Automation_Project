package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		//driver.findElement(By.xpath("//input[@value='jQuery']")).click();		/*
		
		List<WebElement> allOption = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//label//input"));
	
	for(WebElement option:allOption) {
		 
		if(option.getText().equals("jQuery")||option.getText().equals("Bootstrap")) 
		{
			option.click();
	    }	
	}
	
	}

}
