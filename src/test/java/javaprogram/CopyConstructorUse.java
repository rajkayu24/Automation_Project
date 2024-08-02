package javaprogram;

class Demo1{
	int a,b;
	Demo1(){
		System.out.println("hi");
	}
	Demo1(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println(a+" "+b);
	}
	Demo1(Demo1 ref){
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
}



public class CopyConstructorUse {

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Demo1 d2=new Demo1(10,20);
		Demo1 d3=new Demo1(d2);//here we are copying the value of
		//parametized constructor into copy constructor

	}

}
