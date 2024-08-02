package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosugestDropORDynamicDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		try {
		List<WebElement> totaloptions = driver.findElements(By.xpath("//ul[@class='G43f7e']//div[contains(@class,'wM6W7d')]//span"));
		
		for(WebElement option:totaloptions) {
			String text = option.getText();
			System.out.println(text);
			
			if(text.contains("selenium tutorial"))
			{
			option.click();
			
			}
			
		}
	}catch(Exception e){
		
	}

	}}
