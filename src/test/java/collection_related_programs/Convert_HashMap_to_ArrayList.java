package collection_related_programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

// there is no direct methods in HashMap which converts the HashMap to ArrayList.
//In this post, we will see how to convert HashMap to ArrayList in java with examples. At the end, 
//we will also see java 8 code to convert map to list in java.
//As HashMap contains  key-value pairs, there are three ways you can convert given HashMap to ArrayList.
//convert HashMap keys into ArrayList or you can convert HashMap values into ArrayList 
//or you can convert  key-value pairs into ArrayList.

public class Convert_HashMap_to_ArrayList {


//Conversion Of HashMap Keys Into ArrayList 

	/*
  public static void main(String[] args) {
//we use keySet() method of HashMap which returns the Set containing all keys of the HashMap	
	HashMap<String,String> map=new HashMap<String,String>();
	map.put("John Kevin", "Average"); 
	map.put("John", "good"); 
	map.put("Kevin", "best"); 
	map.put("Jolly", "best"); 
	System.out.println(map);//{Kevin=best, Jolly=best, John Kevin=Average, John=good}
	Set<String> keyset = map.keySet();
	System.out.println("key set are:"+keyset);//[Kevin, Jolly, John Kevin, John]
	
	//Creating an ArrayList of keys by passing the keySet 
    
	ArrayList<String> listOfKeys = new ArrayList<String>(keyset);
	System.out.println("list of keys are:"+listOfKeys );//[Kevin, Jolly, John Kevin, John]
  
  }
*/
  //) Conversion Of HashMap Values Into ArrayList :
  /*
	 public static void main(String[] args) {
		//we use keySet() method of HashMap which returns the Set containing all keys of the HashMap	
			HashMap<String,String> map=new HashMap<String,String>();
			map.put("John Kevin", "Average"); 
			map.put("John", "good"); 
			map.put("Kevin", "best"); 
			map.put("Jolly", "best"); 
			System.out.println(map);//{Kevin=best, Jolly=best, John Kevin=Average, John=good}
			
			Collection<String> keyvalues = map.values();
			
			System.out.println("key values are:"+keyvalues );//[Kevin, Jolly, John Kevin, John]
			
			//Creating an ArrayList of keys by passing the keySet 
		    
			ArrayList<String> listOfValues = new ArrayList<String>(keyvalues);
			System.out.println("list of values are:"+listOfValues );//[Kevin, Jolly, John Kevin, John]
		  */
}	
	//c) Conversion Of HashMap’s  Key-Value Pairs Into ArrayList :
 
                                                                                                       

