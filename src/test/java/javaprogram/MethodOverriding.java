package javaprogram;
class Parent{
	void eat(){//overriden method
		System.out.println("parent are eating");
	}
}
class Child extends Parent{
	void eat(){//overriding method
		System.out.println("child is eating");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		Child m=new Child();
		m.eat();//here child method will call 
		
	}

}
