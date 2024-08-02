package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpencartTest {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
	    driver.manage().window().maximize();
	    
	   driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	   driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
	   
	   String filepath=System.getProperty("user.dir")+"\\Testdata\\opencartReg.xlsx";
	   
	   int rows=ExcelUtils.getRowCount(filepath, "Sheet1");
	   
	   System.out.println("no. of rows are:"+rows);
	   
	   for(int i=1;i<=rows;i++) {
	  //reading the data from Excel
		   String fn = ExcelUtils.getCellData(filepath,"Sheet1",i,0);
		  String ln = ExcelUtils.getCellData(filepath, "Sheet1", i,1);
		  String em = ExcelUtils.getCellData(filepath, "Sheet1",i,2);
		  String pass = ExcelUtils.getCellData(filepath, "Sheet1",i,3);
		  
	try {	 
		
	//pass the data to the application
	  driver.findElement(By.name("firstname")).sendKeys(fn);
	  driver.findElement(By.name("lastname")).sendKeys(ln);
	  driver.findElement(By.name("email")).sendKeys(em);
	  driver.findElement(By.name("password")).sendKeys(pass);
	  WebElement newsletter = driver.findElement(By.name("newsletter"));
	  //scrolldown the page
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  
	  //JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click();",newsletter);
	 
	  WebElement agreecheck = driver.findElement(By.name("agree"));
	  js.executeScript("arguments[0].click();",agreecheck);
	
	  WebElement continuebtn = driver.findElement(By.xpath("//button[normalize-space()='Continue']"));
	  js.executeScript("arguments[0].click();",continuebtn);

	   
	  ExcelUtils.setCellData(filepath, "Sheet1", i, 4, "pass");
	  ExcelUtils.fillGreenColor(filepath,"Sheet1",i,4);

	  
    }catch(Exception e) {}  
	
  }
	   
}

}
