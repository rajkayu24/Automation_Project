package javaprogram;
class Animal1{
	void eat() {
	System.out.println("eating.........");	
	}
}
class Dog1 extends Animal1{
	void bark() {
		System.out.println("barking.........");	
	}
}
class BabyDog1 extends Animal1{
	void run() {
		System.out.println("running.........");	
	}
}

public class HierarchicalInheritance{

	public static void main(String[] args) {
		Dog1 d=new Dog1();
		d.bark();
		d.eat();
		BabyDog1 b=new BabyDog1();
		b.eat();
		b.run();
		
		
		
		
	}

}
 