package testNg_Programs;

import org.testng.annotations.Test;

public class ParallelMethods {
@Test
public void tc1() {
	System.out.println("i am tc1"  +Thread.currentThread().getId());
}

@Test
public void m2() {
	System.out.println("i am tc2"+Thread.currentThread().getId());	
}
@Test(threadPoolSize=3, invocationCount=3, timeOut=3000 ) 
public void m3() {
	System.out.println("i am tc3"+Thread.currentThread().getId());
}
}
