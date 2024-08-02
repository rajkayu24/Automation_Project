package seleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		
System.out.println("no of links available on the page :"+totalLinks.size());
int Brokenlinks=0;
for(WebElement link:totalLinks) {
	String hrefAttributeValue = link.getAttribute("href");
	
	if(hrefAttributeValue==null||hrefAttributeValue.isEmpty()) {
		System.out.println("link is not boken link and not normal link");
		continue;
		
	}
URL linkurl=new URL(hrefAttributeValue);

HttpURLConnection conn =(HttpURLConnection)linkurl.openConnection();
conn.connect();

 if(conn.getResponseCode()>=400) {
	System.out.println(hrefAttributeValue+"link is broken link");

	Brokenlinks++;
     }else {
             System.out.println(hrefAttributeValue+"not broken link");
    }
 
System.out.println("total broken links are:"+Brokenlinks);}
	}

}
