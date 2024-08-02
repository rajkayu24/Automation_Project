package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleSelectDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropele = driver.findElement(By.id("multiselect1"));
	
	Select se=new Select(dropele);
	boolean multidrp = se.isMultiple();
	System.out.println("is multi select dropdown: "+multidrp);//true,than we can select multiple option in drpdwn
	/*	
	se.selectByVisibleText("Volvo");
	se.selectByVisibleText("Hyundai");
	se.selectByVisibleText("Audi");
	*/
	//we can select multiple option by choice also
	List<WebElement> list = se.getOptions();
	
	for(WebElement option:list) {
		//String optionname = option.getText();
		if(option.getText().equals("Volvo")||option.getText().equals("Hyundai")) {
			option.click();
		
		}
	}
	
	
	
	}

}
