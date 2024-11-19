package string_Programs;

//WAP to remove White_Space from given string using built-in method
/*
public class Remove_WhiteSpace_fromString {

	public static void main(String[] args) {
		String s="i am sheetal";
		
		String stngWithtwhitespace = s.replaceAll("\\s","");
	System.out.println("string without white space is:"+stngWithtwhitespace);	
	}

}*/

//2 nd approach -Remove white space without using built-in method

public class Remove_WhiteSpace_fromString {
	public static void main(String[] args) {
		String s = "i am sheetal";
		String strwithoutWhitespace = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if ((ch[i] != ' ')&&(ch[i]!='\t')) //we wrote \t for if any tab available than also it should not  
			{
				strwithoutWhitespace = strwithoutWhitespace + ch[i];
			}

		}
		System.out.println("string without white space:" + strwithoutWhitespace);
	}
}