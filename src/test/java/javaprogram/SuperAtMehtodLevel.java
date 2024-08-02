package javaprogram;

class AllAnimal{
	void show() {
		System.out.println("this is parent class method");
	}
}
class AllDog extends AllAnimal{
	
	void show() {
		super.show();//this is parent class method
		System.out.println("this is child class method");//this is child class method
	}
}


public class SuperAtMehtodLevel {

	public static void main(String[] args) {
		
AllAnimal d=new AllDog();
d.show();
	}

}
