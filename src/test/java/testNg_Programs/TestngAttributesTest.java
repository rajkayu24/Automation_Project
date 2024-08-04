package testNg_Programs;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TestngAttributesTest {

@Test(priority=0,invocationCount=3,threadPoolSize=3)
public void test1() {
	System.out.println("i am test1"+ "   "+ "thread name is   "+Thread.currentThread().getName());//it will execute 3 time because of invocationCount=3
	
}

@Test(priority=1,invocationCount=2,timeOut=3)
public void test2() {
	System.out.println("i am test2");//it will execute 2 time because of invocationCount=2
// timeOUt -maximum number of milliseconds this test should take in execution
	
}
@Test(priority=1,timeOut=3,invocationCount=2,threadPoolSize=3,expectedExceptions=ThreadTimeoutException.class)
public void test3() {
	System.out.println("i am test2");//it will execute 2 time because of invocationCount=2
// timeOUt -maximum number of milliseconds this test should take in execution
	
}
}
