package collection_related_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetUse {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		//adding ele into HashSet
		hs.add("ram");
		hs.add("raj");
		hs.add("rani");
		hs.add("rama");
		hs.add("raju");

		//printing ele 
		System.out.println(hs);
		
		//removing ele
		hs.remove("rama");
		
		System.out.println("hashSet after removing ele:"+hs);
		
		//inserting ele-not possible
		
		//accessing specific ele-not possible
		
		//converHashSet -ArrayList
		
		ArrayList<String> mylist=new ArrayList<String>(hs);
		
		System.out.println(mylist);
		
		System.out.println(mylist.get(1));
	
		//reading data using for each loop
		 
		for(String ele:mylist) {
			System.out.println(ele);
		}
		
		//reading data by using iterator
		
		Iterator<String> it = mylist.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(	it.next());
		
		}
		//clear all ele
		mylist.clear();
		System.out.println(mylist.isEmpty());//true
		
	}

}
