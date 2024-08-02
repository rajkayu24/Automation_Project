package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSimple {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//dropdown having select tag
		 WebElement drpele = driver.findElement(By.id("drop1"));
		 
		 //select single option from dropdown
		
		 Select se=new Select(drpele);
		boolean b1 = se.isMultiple();
		System.out.println("boolean value for drpdown: " +b1);//false
	
	//se.selectByVisibleText("doc 2");//this is 1 st way
	//se.selectByIndex(1);//or 2 nd way
	//se.selectByValue("def");//or 3 rd way
		  // se1.deselectByValue("def");//deselect this option
		
		//if i want to deselect any option 
		
		//se1.deselectByVisibleText("doc 2");//or 2 nd  way of deselect
		   //se1.deselectByIndex("1");//or 3 rd way of deselect
	 //if i want to deselect all option than 
			   
		//se1.deselectAll();
			   
			   

		//get multiple options from dropdown
		List<WebElement> list = se.getOptions();
		
		for(WebElement option:list) {
			
			System.out.println(option.getText());//it will print all options
			
			if(option.getText().equals("doc 3"))
			{
				option.click();//it will click based on our choice
			}
		}
		
		  
	}

}
