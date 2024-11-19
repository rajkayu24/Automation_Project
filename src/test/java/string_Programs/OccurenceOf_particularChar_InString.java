package string_Programs;

public class OccurenceOf_particularChar_InString {
	

		public static void main(String[] args) {
		String s="i am sheetal";
		char ch[] =s.toCharArray();
		int len = ch.length;
		int count=0;
		for(int i=0;i<len;i++) {
			if(s.charAt(i)=='a'){
				count++;
			}
		}
		System.out.println("occerence of character a in given string:"+count);
		}
	}
	//similarly we can find occerence of any no which will ask in interview 
	//if they ask b than u need to write b instead of a
	//output==occerence of character a in given string:4

