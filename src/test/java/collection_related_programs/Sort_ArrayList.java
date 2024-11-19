package collection_related_programs;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("ankit");
		al.add("Raj");
		al.add("kayra");
		al.add("sheetal");
		al.add("sarika");
		
		System.out.println("ArrayList before Sorting:"+al);//[ankit, Raj, kayra, sheetal, sarika]
		
		//Collections.sort(al);
		
		//System.out.println("ArrayList after sorting:"+al);//[Raj, ankit, kayra, sarika, sheetal]
		
//but if we want to avaid case sensitivity than we can sort this below way
		
		Collections.sort(al,String.CASE_INSENSITIVE_ORDER);//his method sorts the specified list according
		//to supplied Comparator.
		System.out.println("ArrayList after sorting:"+al);//[ankit, kayra, Raj, sarika, sheetal]
		
	}

}
