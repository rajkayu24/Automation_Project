package collection_related_programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapUse {

	public static void main(String[] args) {
	
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//add pair 
		hm.put(101,"Sheetal");
		hm.put(102,"Sheela");
		hm.put(103,"Sheeta");
		hm.put(104,"Shalini");
		hm.put(105,"Shori");
		hm.put(106,"Sheetal");
		//printing the HashMap
		
		System.out.println(hm);
		//size of HashMap
		System.out.println(hm.size());
		
		//insert ele/replace ele /modify ele
		hm.put(101,"Shanu");
		
		System.out.println("after adding or replacing ele:"+hm);//because key can not be duplicate ,value may be duplicate
		
		//adding ele/insert ele 
		hm.put(107,"kayra");
		System.out.println("after adding new ele:"+hm);
		
		//access specific ele
		System.out.println(hm.get(102));
		
		//remove pair-we can not remove single key or value ,one pair we need to remove
		
		hm.remove(107);
		System.out.println("after removing ele:"+hm);
		
		//print all keys
		System.out.println(hm.keySet());
		
		//print all values 
		System.out.println(hm.values());
		
		//print all pair->key+value
		System.out.println(hm.entrySet());
		
		//read datafor
		for(int k:hm.keySet()) {
			System.out.println(hm.get(k));
			
		}
		
		//using iterator -but HashMap does not contain iterator method so will covert to set then we 
		//use iterator
		//it=hm.iterator();//this is wrong because HashMap does not contain iterator method
		//so first will retrive keys as Set then will iterate keys one by one and through key will get values 
		/*
	Iterator<Integer> it = hm.keySet().iterator();//because keySet method will return keys as Set
	while(it.hasNext()) {
		Integer k = it.next();
		
		System.out.println(hm.get(k));
		
	}*/
		//2 nd way using iterator
		 Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		 
		 while(it.hasNext()) {
			 
			 Entry<Integer, String> entry = it.next();
			 System.out.println(entry.getKey()+"   "+entry.getValue());
		 }
		
}	
		
	}


 