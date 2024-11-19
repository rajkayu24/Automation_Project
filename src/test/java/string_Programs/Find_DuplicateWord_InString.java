package string_Programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class Find_DuplicateWord_InString {

	public static void main(String[] args) {
		String s="i am sheetal sheetal";
		
		String  strArray[]=s.split(" ");
		Set<String> set=new LinkedHashSet();
 		
		for(String word:strArray) {
 			set.add(word);
		}
			System.out.println(set);//o/p-->[i, am, sheetal]
 
       String st = set.toString(); 
		String sr = st.replaceAll(",","");
	System.out.println(sr);	//o/p-->[i am sheetal]
	}
	
	
	//method-2
	
	}

