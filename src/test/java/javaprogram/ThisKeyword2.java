package javaprogram;
//use of this(...)
public class ThisKeyword2 {

ThisKeyword2(){
	this(100);//it is used to call paramterized constructor
	//from current class  default constructor 
	System.out.println("this is default constructor");
}
ThisKeyword2(int a){
	System.out.println("this is param constructor " +a);
}
	public static void main(String[] args) {
		ThisKeyword2 k=new ThisKeyword2();
	}

}
