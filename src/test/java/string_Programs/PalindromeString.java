package string_Programs;

public class PalindromeString {

	public static void main(String[] args) {
		String s="madam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
        rev=rev+s.charAt(i);
		}
System.out.println("reverse string is:"+rev);
if(rev.equals(s)) {
	System.out.println("given string is palindrome");
}else {
	System.out.println("given string not palindrome");
}
	}

}
