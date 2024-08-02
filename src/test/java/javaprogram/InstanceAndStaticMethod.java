package javaprogram;

public class InstanceAndStaticMethod {
int a=12 ,b=20;
 static int c=20,d=10;

 //instance method
public void add() {
System.out.println(a+b);//instance method can access instance var
System.out.println(c+d);//instance method can access static var
}

//static method 
public static void sub() {
System.out.println(c-d);//static  method can access only static var	

}	


public static void main(String[] args) {
	InstanceAndStaticMethod ins=new InstanceAndStaticMethod();
	ins.add();
	
	InstanceAndStaticMethod.sub();//1 st way to call static method
	//sub();//2 nd way to call static method
	//ins.sub();// 3 rd way 
	
	}

}
