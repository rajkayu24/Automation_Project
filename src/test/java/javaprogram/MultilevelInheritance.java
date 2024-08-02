package javaprogram;

class Animal2{
	void run() {
		System.out.println("animal is running");
	}
}
class Dog extends Animal2 {
void bark() {
	System.out.println("dog is barking");	
	}
}
class BabyDog extends Dog{
void cry() {
	System.out.println("babydog is crying");	
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		
		BabyDog b=new BabyDog();
		b.run();
		b.bark();
		b.cry();
	}

}
