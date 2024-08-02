package seleniumPractice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//Without Using Actions class
public class TooltipMsg {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		//Actions ac=new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		String tooltipText = search.getAttribute("title");
		System.out.println("tooltip msg is:"+tooltipText);
		}

	
}

