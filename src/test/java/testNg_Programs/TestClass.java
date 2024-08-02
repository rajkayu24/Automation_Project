package testNg_Programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass {

	
@Test(dataProvider="dp1")
public void m1(String un,String pass) {
	
	System.out.println(un+": "+pass );
}

@Test(dataProvider="dp2")
public void m2(String un,String pass) {
	
	System.out.println(un+": "+pass );
}



@DataProvider(name="dp1")

public String[][] provideData1(){
	
	String data[][]= {{"admin","admin1"},
			{"admin","admin2"},
			{"admin","admin3"}
			};
	
	return data;
	
}

@DataProvider(name="dp2" ,indices= {0,2})

public String[][] provideData2(){
	
	String data[][]= {{"admin","admin11"},
			{"admin","admin22"},
			{"admin","admin33"}
			};
	
	return data;
	
}
}

