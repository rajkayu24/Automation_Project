package seleniumPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//handle more than 2 window are open
public class HandleMultipleWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	Set<String> windowids = driver.getWindowHandles();
	
	//using enhanced for loop -this approach we use when we have more than 2  windows are open
	
for(String winid:windowids)
{
  String title = driver.switchTo().window(winid).getTitle();	
	
  if(title.equals("Human Resources Management Software | OrangeHRM"))
 {//here in if condition we can give the title of window where we want to perform actons.
	 driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[2]//button")).click();
		//here we r clicking on contact sales button
  }
		
 }

/*
//Q]]closing specific browser windows based on choice

//lat's say   1st browser window has title ->x    and   2nd->y  3rd-->z    4th-->a  5th-->b so like this we may have n number of window and based upon chice we can 
//we can close the specific window

for(String winid:windowids)
{
  String title = driver.switchTo().window(winid).getTitle();	


if(title.equals("x")||title.equals("z")||title.equals("b")) {	
driver.close();//here close() we use because we want to close only one window at a time 
//here in if condition we can specify the browser title which i want to close 
}
}*/

  }

}
