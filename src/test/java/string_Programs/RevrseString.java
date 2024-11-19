package string_Programs;

//WAP to rev string
public class RevrseString {

	public static void main(String[] args) {
		String s = "Automation";
		String rev = "";
		for (int i =s.length()- 1; i>= 0;i--) {
			rev = rev + s.charAt(i);// o/p=Reverse string is :noitamotuA

		// rev=rev+s.charAt(i)+"";//o/p=>Reverse string is :n o i t a m o t u A
	       //rev = rev + s.charAt(i)+"-";//o/p=>Reverse string is :n-o-i-t-a-m-o-t-u-A-
		
		}
		System.out.println("Reverse string is :" + rev);
	}

}
