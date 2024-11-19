package string_Programs;
// WAP to Reverse the string with preserving the position of spaces
//(or)WAP for reverse each word in the string like if string is 
//String s="i am sheetal";
//then in o/p evrey letter also should be rev in each word
//so o/p=>lateehs ma i

public class ReverseStringWords {

	public static void main(String[] args) {
		String s="i am sheetal";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse of given string sentence is:"+rev);//o/p=>reverse of given string sentence is:lateehs ma i
	}

}
