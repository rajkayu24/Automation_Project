
package string_Programs;

public class Globant1 {

	public static void main(String[] args) {
		String s="i am from Globant";
		int count=0;
		for(int i=1;i<s.length();i++) {
			count++;
		
			if(	s.charAt(i+1)== ' ' ) {
				continue;			}
			
		}
System.err.println(count);
	}

}
