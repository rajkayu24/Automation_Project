package testNg_Programs;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

@Override	
public void onTestSuccess(ITestResult result){
		System.out.println("Test Method" +"- "+result.getName()+" " +"passed");
	}

@Override	
public void onTestStart(ITestResult result){
		System.out.println("Test Methods"+"- "+result.getName()+" "+"Start");
	}
@Override	
public void onTestSkipped(ITestResult result){
	System.out.println("Test Methods"+" -"+result.getName()+" "+"skipped");	
	}
@Override	
public void onTestFailure(ITestResult result){
	System.out.println("Test Methods"+"-"+result.getName()+" "+"fail");	
	}
}
