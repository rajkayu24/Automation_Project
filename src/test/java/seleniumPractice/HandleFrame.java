package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Nested Frames']")).click();
		
		System.out.println("main frame has no. of frames are  :"+driver.findElements(By.tagName("frame")).size());
		//1st frame is frame-top and 2nd frame is frame-bottom 
		//inside frame-top 3 child frames are 
		driver.switchTo().frame("frame-top");
		System.out.println("frame-top has no of frames are:"+driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame("frame-left");
		System.out.println("i am inside left frame");
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-middle");
		System.out.println("i am inside middle frame");
		driver.switchTo().parentFrame();//go back to parent frame
		
		driver.switchTo().frame("frame-right");
		System.out.println("i am inside right frame");
		driver.switchTo().defaultContent();//go back to main frame 
		
		driver.switchTo().frame("frame-bottom");
		System.out.println("i am inside bottom frame");
		driver.switchTo().parentFrame();
		
		
		

	}

}
