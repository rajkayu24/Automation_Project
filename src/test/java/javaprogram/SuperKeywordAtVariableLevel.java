package javaprogram;

class Parent1{
int a=10;
}
class Child1 extends Parent1{
	int a=20;
	public void show() {
		
		System.out.println(a);//it will call local a 
		System.out.println(super.a);//it will call super class a
	}
	
}
public class SuperKeywordAtVariableLevel {

	public static void main(String[] args) {
	Child1 p=new Child1();
	p.show();
	}

}
