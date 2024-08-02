package javaprogram;

public class Stringpro {

	public static void main(String[] args) {
	String rev= "";
String s="madam";
for(int i=s.length()-1;i>=0;i--){
	
rev=rev+s.charAt(i);

}
System.out.println(rev);
if(s.equals(rev)) {
	System.out.println("string is palindrome");
}else {System.out.println("string is not palindrome");}
	}

}
