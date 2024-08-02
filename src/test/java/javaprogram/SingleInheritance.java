package javaprogram;


class Animal{
	void run(){
		System.out.println("Animal is running");
	}
}

class Dog2 extends Animal{
	void bark() {
		System.out.println("dog is barking");
	}
}
public class SingleInheritance  {
	public static void main(String[] args) {
		
		Dog2 d=new Dog2();
	d.run();
	d.bark();
	}

}
