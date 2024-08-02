package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest {
	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demo.guru99.com/test/newtours/register.php");
    driver.manage().window().maximize();
  
    String filepath=System.getProperty("user.dir")+"\\Testdata\\DataDrivenTest.xlsx";

    int rows=ExcelUtils.getRowCount(filepath,"Sheet1");

    for(int i=1;i<=rows;i++) {
	
	//read data from excel
	//pass data to app
	//validate and update results in excel

    	
   // step1-//read data from excel
    String fn = ExcelUtils.getCellData(filepath,"Sheet1",i, 0);//filepath=xlfile in ExcelUtils
	String ln = ExcelUtils.getCellData(filepath,"Sheet1",i, 1);
	String ph = ExcelUtils.getCellData(filepath,"Sheet1",i, 2);
	String un = ExcelUtils.getCellData(filepath,"Sheet1",i, 3);
	String add = ExcelUtils.getCellData(filepath,"Sheet1",i, 4);
	String city = ExcelUtils.getCellData(filepath,"Sheet1",i, 5);
	String st = ExcelUtils.getCellData(filepath,"Sheet1",i,6);
	String pc = ExcelUtils.getCellData(filepath,"Sheet1",i,7);
	String cntry = ExcelUtils.getCellData(filepath,"Sheet1",i,8);
	String em = ExcelUtils.getCellData(filepath,"Sheet1",i,9);
	String pass = ExcelUtils.getCellData(filepath,"Sheet1",i,10);
	String cnpass = ExcelUtils.getCellData(filepath,"Sheet1",i,11);
	

   //step2-//pass data to app
   driver.findElement(By.name("firstName")).sendKeys(fn)	;
   driver.findElement(By.name("lastName")).sendKeys(ln);
   driver.findElement(By.name("phone")).sendKeys(ph);
   driver.findElement(By.name("userName")).sendKeys(un);
   driver.findElement(By.name("address1")).sendKeys(add);
   driver.findElement(By.name("city")).sendKeys(city);
   driver.findElement(By.name("state")).sendKeys(st);
   driver.findElement(By.name("postalCode")).sendKeys(pc);

   WebElement countryEle = driver.findElement(By.name("country"));
   Select se=new Select(countryEle);
   se.selectByValue(cntry);
  
   //scrolldown the page
  JavascriptExecutor js=(JavascriptExecutor)driver;
  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
  
  driver.findElement(By.name("email")).sendKeys(em);
  driver.findElement(By.name("password")).sendKeys(pass);
  driver.findElement(By.name("confirmPassword")).sendKeys(cnpass);
  driver.findElement(By.name("submit")).click();
  
  /*//1 st way to validate
   String actText = driver.findElement(By.xpath("//font[contains(text(),'Thank you for registering.')]")).getText();
   System.out.println(actText);
   String expText = "Thank you for registering. You may now sign-in using the user name and password you've just entered.";

   if(actText.equals(expText)) 
  {
    System.out.println("Test passed");

    ExcelUtils.setCellData(filepath,"Sheet1",i, 12,"Regitration completed");
    ExcelUtils.fillGreenColor(filepath, "Sheet1",i,12);
    }else {
          System.out.println("Test Failed");

    ExcelUtils.setCellData(filepath,"Sheet1",i, 12,"Regitration failed");
    ExcelUtils.fillRedColor(filepath, "Sheet1",i,12);
   }
   
  */
  
  
  //2nd way to validate
  
  String actText=driver.findElement(By.xpath("//table//tbody//tr//td//p//font//b//following::font[1]")) .getText();
       System.out.println(actText);
    
      if(actText.contains("Thank you for registering."))
      {
    	System.out.println("Test passed");
    		
    	ExcelUtils.setCellData(filepath,"Sheet1",i, 12,"Regitration completed");
        ExcelUtils.fillGreenColor(filepath, "Sheet1",i,12);
       } else{
    		 System.out.println("Test Failed");
    		
    		 ExcelUtils.setCellData(filepath,"Sheet1",i, 12,"Regitration failed");
    		 ExcelUtils.fillRedColor(filepath, "Sheet1",i,12);
       }
       
     driver.findElement(By.xpath("//a[normalize-space()='REGISTER']")).click();

}}}
