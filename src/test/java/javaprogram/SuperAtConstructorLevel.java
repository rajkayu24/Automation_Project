package javaprogram;

class Elephant{
	Elephant(){
		System.out.println("this is super Elephant class");
	}
Elephant(int a){
	System.out.println(a);
}
}
class BabyElephant extends Elephant{
 BabyElephant(){
	 super(100); 
	 //super();//it is not comulsary to write sper(); because if u r writing than also compiler will call super class
	 //default constructor but in case of parameterized contructor u need to write super(value) compulsary 
	  
	System.out.println("this is BabyElephant class");
}}

public class SuperAtConstructorLevel {

	public static void main(String[] args) {
		BabyElephant b=new BabyElephant();
		

	}

}
