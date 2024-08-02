package javaprogram;

public class MethodOverloading {
int a=10,b=20;
	public void sum() {
		System.out.println(a+b);
	}
	
	public void sum(int x,int y) {
		
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.sum();//30

		m.sum(10,30);//40
	}

}
