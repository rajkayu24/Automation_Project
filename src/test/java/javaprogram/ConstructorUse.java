package javaprogram;

class Abc{
	int a,b;
	Abc(){
		 a=10; b=20;
		System.out.println(a+" "+b);
	}
	Abc(Abc ref){
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
}

public class ConstructorUse {

	public static void main(String[] args) {
		Abc a1=new Abc();
		Abc a2=new Abc(a1);//here we r copying the values of
		//default constructor into copy constructor
	}

}
