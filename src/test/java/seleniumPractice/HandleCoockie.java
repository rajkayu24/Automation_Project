package seleniumPractice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCoockie {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
driver.get("https://www.google.com/");
//capture cookie and print those cookie
Set<Cookie> co = driver.manage().getCookies();
	System.out.println(co.size());
	
	for(Cookie cookie:co) {
		System.out.println(cookie.getName()+"  : "+cookie.getValue());
	}
	
	//add cookie
	Cookie cobj=new Cookie("Coockie123","Cookievalue");
	driver.manage().addCookie(cobj);
	
	Set<Cookie> allco = driver.manage().getCookies();
	for(Cookie c:allco) {
		System.out.println(c.getName()+"  : "+c.getValue());
	}
	//delete specific cookie 
	
	driver.manage().deleteCookieNamed("Coockie123");
	Cookie con = driver.manage().getCookieNamed("Coockie123");
	
	System.out.println(con);//null
	
	//delete all cookie
	driver.manage().deleteAllCookies();
	Set<Cookie> cookies = driver.manage().getCookies();
	
	System.out.println(cookies.size());//0
	}

}
