package seleniumPractice;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlazeDemoWebsite {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://blazedemo.com/reserve.php");
	driver.manage().window().maximize();
	
	

	
	int rows = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
	System.out.println("total rows are:"+rows);
	
	//create array
	String priceArry[]=new String[rows];
	
	//captur the price and then store into Array
	for(int r=1;r<=rows-1;r++) {
	
	     String price = driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
	
	     //System.out.println(price);
	
	        priceArry[r-1]=price;//1 st price will stroe at 0 postion in array and so on//adding price into array
	    }
	
	//7- Sort prices then find lower price value
	for(String arrvalue:priceArry)
	{
		System.out.println(arrvalue);
	}
	
	// this will able to sort strings. so no need to convert to number
	String lowestPrice=priceArry[0];
	System.out.println("Lower price:"+lowestPrice);
	
	
	// Find record in table having lower price
		
		for(int r=1;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
			
			if(price.equals(lowestPrice))
			{
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[1]//input")).click();
				break;
			}
			
			 //Fill the details then click on Purchase Flight button
				
				driver.findElement(By.id("inputName")).sendKeys("John");
				driver.findElement(By.id("address")).sendKeys("1403 American Beauty Ln");
				driver.findElement(By.id("city")).sendKeys("Columbus");
				driver.findElement(By.id("state")).sendKeys("OH");
				driver.findElement(By.id("zipCode")).sendKeys("43240");
				driver.findElement(By.id("creditCardNumber")).sendKeys("6789067345231267");
				driver.findElement(By.id("creditCardYear")).clear();
				driver.findElement(By.id("creditCardYear")).sendKeys("2023");
				driver.findElement(By.id("nameOnCard")).sendKeys("John Canedy");
				driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
			
			//10 - validation
				String msg=driver.findElement(By.xpath("//h1")).getText();
				
				if(msg.contains("Thank you for your purchase"))
				{
					System.out.println("Success !! Passed");
				}
				else
				{
					System.out.println("Failed");	
				}
			
				driver.quit();
				
			
}}}