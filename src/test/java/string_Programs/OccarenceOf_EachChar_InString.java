package string_Programs;

import java.util.HashMap;
import java.util.Map;

//How to find duplicate characters  and their count in a given string in Java?
//o/p duplicate characters and their count is t : 4, e : 3, r : 2 and B : 2.



public class OccarenceOf_EachChar_InString {

	public static void main(String[] args) {
	
		
			String s="testing selenium";
			//replace the whitespace
			s=s.replace(" ", "");
			char ch[]=s.toCharArray();
			int count=0;
			Map<Character,Integer> m=new HashMap<Character,Integer>();
		    
			for(int i=0;i<ch.length;i++) {
			count=0;
		    for(int j=0;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
			}
			
		}
		m.put(ch[i],count);
		
		}

	System.out.println(m);//o/p->{s=2, t=2, e=3, u=1, g=1, i=2, l=1, m=1, n=2}
		}

	
	}


