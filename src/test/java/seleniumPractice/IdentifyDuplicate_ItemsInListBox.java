package seleniumPractice;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
//how to Identify Duplicate_Items In ListBox  and this same logic we can use for finding duplicate element from dropdown


public class IdentifyDuplicate_ItemsInListBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		WebElement listboxElement = driver.findElement(By.xpath("//select[@id='colors']"));

Select listbox=new Select(listboxElement);

Set<String>  uniqueElement=new HashSet<String>();//we use here Set and HashSet because this avaid duplicate 

boolean flag=false;
for(WebElement option:listbox.getOptions()) {
	String optiontext = option.getText();
	
	if(!uniqueElement.add(optiontext) ) {
		System.out.println("found duplicate element:"+optiontext);
	flag=true;
	}
}

if(!flag) {
	System.out.println(" no duplicate element found");
	

}
driver.quit();

	}

}
