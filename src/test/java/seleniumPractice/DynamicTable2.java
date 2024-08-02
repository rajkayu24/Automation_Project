package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		//Login
		WebElement username = driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
       //click on cancel security alert 
		WebElement securitynotification = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn-close']")));
		securitynotification.click(); 
       //customers
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
	
		
	String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();	
	System.out.println(text);//Showing 1 to 10 of 20211 (2022 Pages)
	int total_pages =Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
	System.out.println("total no of pages are:"+total_pages);
	
	for(int p=1;p<=5;p++) {
		
		
		if(p>1)
		{
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));
			System.out.println("active page is:"+active_page.getText());
			//active_page.click();
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",active_page);
		}
		
		
		//no of rows
		int noOfRows = driver.findElements(By.xpath("//div[@id='customer']//tbody//tr")).size();
		System.out.println("total no. of rows in active page:"+noOfRows );
		
		for(int r=1;r<=noOfRows;r++)
		{
			String Customername = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
			 String Email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();	
			 String cutomerGroup = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
	         System.out.println(Customername+"             "+Email+"            "+cutomerGroup );
		driver.navigate().refresh();
		}
	
	}
driver.quit();
	}}
