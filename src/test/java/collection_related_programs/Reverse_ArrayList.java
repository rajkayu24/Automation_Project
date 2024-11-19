package collection_related_programs;

import java.util.ArrayList;
import java.util.Collections;
//you can use this method to reverse any List type like ArrayList, LinkedList
//or Vector.

public class Reverse_ArrayList {

	public static void main(String[] args) {
		  //Constructing an ArrayList
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Ankit");
		al.add("Kayra");
		al.add("Rajendra");
		al.add("Sheetal");
		al.add("Shubham");
		al.add("Satyam");
		
		//Printing list before reverse
	System.out.println("ArrayList before reverse:"+al);//[Ankit, Kayra, Rajendra, Sheetal, Shubham, Satyam]

    //Reversing the list using Collections.reverse() method\
	Collections.reverse(al);
	//Printing list after reverse
	System.out.println("ArrayList after reverse:"+al);//[Satyam, Shubham, Sheetal, Rajendra, Kayra, Ankit]
	
	}

}
