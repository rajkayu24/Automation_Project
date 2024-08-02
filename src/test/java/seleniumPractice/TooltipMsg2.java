package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//using Actions Class 
public class TooltipMsg2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/tool-tips");
		
		driver.manage().window().maximize();
		
		Actions ac=new Actions(driver);
		WebElement mouseOver = driver.findElement(By.xpath("//input[@id='toolTipTextField']"));
		
		ac.moveToElement(mouseOver).build().perform();
	
		Thread.sleep(2000);

	}

}
