package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleIframe {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='iFrame']")).click();
		
		
		
		//switch to iframe
				driver.switchTo().frame("mce_0_ifr");
				//identify text inside iframe
				WebElement text = driver.findElement(By.xpath("//body[@id='tinymce']//p"));
				text.clear();//clear text
				text.sendKeys("you are welcome");//type our own text 
				driver.switchTo().defaultContent();
				
	}

}
