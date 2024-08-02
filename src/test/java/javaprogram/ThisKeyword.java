package javaprogram;
//use of this()
public final class ThisKeyword {

	ThisKeyword(){
	System.out.println("learn code");	
	}
	ThisKeyword(int a){
		this();//it will call current class default constructor
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		ThisKeyword t=new ThisKeyword(100);
		
	}

}
