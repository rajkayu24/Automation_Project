package string_Programs;
//WAP for reverse words in the string like if
//String s="i am sheetal";
//so o/p=>sheetal am i
public class ReverseStringWord {

	public static void main(String[] args) {
	String s="i am sheetal";
	String  strArray[]=s.split(" ");//we r spliting the string and storig into array
	
	for(int i=strArray.length-1;i>=0;i--) {
		
		System.out.print(strArray[i]+" ");
		
	}
	System.out.println();
	}

}
