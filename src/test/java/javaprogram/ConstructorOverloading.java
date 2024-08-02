package javaprogram;

public class ConstructorOverloading {
	int a=10,b=20;
	ConstructorOverloading () {
		System.out.println(a+b);
	}
	
	ConstructorOverloading(int x,int y) {
		
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading c=new ConstructorOverloading();

		ConstructorOverloading  c2=new ConstructorOverloading(10,20);
	
	}}
