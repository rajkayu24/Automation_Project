package takeScreenshotOfFailedTC;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://github.com/rajkayu24/seleniumTopics/");
		driver.manage().window().maximize();
	}

	public static void capturescreenshot(String testMethodName) throws IOException {
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());// generate time stamp

		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "\\screenshots\\" + testMethodName + "_" + timeStamp + ".png"));

		//FileUtils.copyFile(src, new File("D:\\eclipse-workspace\\Automation_Project\\screenshots\\" + testMethodName + "_" + timeStamp + ".png"));
	
	}
}
