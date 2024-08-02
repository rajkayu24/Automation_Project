package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationbookStore.dev/");
		driver.manage().window().maximize();
	
		//idenfy Book5 which is left of book6 and below of book1 
WebElement book5 = driver.findElement(RelativeLocator.with(By.tagName("li")).toLeftOf(By.id("pid6")).below(By.id("pid1")));
	
	String id = book5.getAttribute("id");
	System.out.println(id);
	
	
	
	if(id.equals("pid5")) {
		System.out.println("test passed ");
		
	}else {
		System.out.println("test is failed");
		
		}
	

	//verify book2 is above is above book6 and right of book1
WebElement book2 = driver.findElement(RelativeLocator.with(By.tagName("li")).toRightOf(By.id("pid1")).above(By.id("pid6")));
	
	String book2id = book2.getAttribute("id");
	
	System.out.println(book2id);
	
//validate the book2 
	if(book2id.equals("pid2")) {
		System.out.println("test passed ");
		
	}else {
		System.out.println("test is failed");
		
		}
	
	
	}
	}

