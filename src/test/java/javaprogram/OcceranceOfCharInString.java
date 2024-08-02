package javaprogram;

public class OcceranceOfCharInString {

	public static void main(String[] args) {
	 String s="abbbcccaaaddd"; int count=0;
	 
	 for(int i=0;i<=s.length()-1;i++) {
		 if(s.charAt(i)=='a') {
			 count++;
		 }
		 
	 }
	 System.out.println("occurence of string in given character:"+count);

	}

}
