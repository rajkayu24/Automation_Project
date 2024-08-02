package javaprogram;

public class ExceptionClass {

	public static void main(String[] args) {
		//System.out.println(10/0);// java.lang.ArithmeticException: / by zero
	/*
		String s="Ankit";
		 int a=Integer.parseInt(s);//converting the string into int than 
		System.out.println(a);// java.lang.NumberFormatException will come
		*/
		
		String s1=null;
		int length=s1.length();
		System.out.println(length);// java.lang.NullPointerException
		
		
		
		
		
		
		
	}

}
