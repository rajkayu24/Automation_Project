package seleniumPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	Set<String> windowids = driver.getWindowHandles();
	
	List<String> windowidlist=new ArrayList<String>(windowids);
	String parentwindowid = windowidlist.get(0);
	System.out.println("parent window id"+parentwindowid);
	
	String childwindowid = windowidlist.get(1);
	System.out.println("child window id"+childwindowid);
	
	//switching to child window 
	String childtitle = driver.switchTo().window(childwindowid).getTitle();
	System.out.println("child title:"+childtitle);
	
	
	//switching to parent window 
		String parenttitle = driver.switchTo().window(parentwindowid).getTitle();
		System.out.println("parent title:"+parenttitle);
		
	
	
	
	//
	
	}

}
