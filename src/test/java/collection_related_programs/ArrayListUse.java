package collection_related_programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class ArrayListUse {

	public static void main(String[] args) {
		
List<String> al=new ArrayList<String>();

//inserting element into ArrayList
al.add("ram");
al.add("raj");
al.add("shyam");
al.add("ranu");
al.add("ram");
al.add("raj");

//size of ArrayList 
System.out.println(al.size());//6

//printing the Arraylist elements 
System.out.println(al);//[ram, raj, shyam, ranu, ram, raj]

// removing element from ArrayList
al.remove(2);

//printing ArrayList after removing of  at 2 th index
System.out.println("ArrayList after removing element:"+al);//ArrayList after removing element:[ram, raj, ranu, ram, raj]

//insert element in ArrayLIst
al.add(2,"reena");

System.out.println("after inserting element in arraylist at 2 th index:"+al);//after inserting element in arraylist at 2 th index:[ram, raj, reena, ranu, ram, raj]


//modify element in the ArrayList(modify/replace/change)
al.set(0,"roma");
System.out.println("after modification arrayList:"+al);//after modification arrayList:[roma, raj, reena, ranu, ram, raj]

//access specific element from ArrayList
System.out.println(al.get(0));//roma

//reading all the elements from ArrayList
//using for loop
for(int i=0;i<=al.size()-1;i++) {

System.out.println(al.get(i));
}
//using for each loop
for(String ele:al) {
	System.out.println(ele);
	
}
//using Iterator 
Iterator<String>  it = al.iterator();
while(it.hasNext()) {
	 //we prefer while loop here because we do not know how much of data is in arrayList
	System.out.println(it.next());//next() will get the ele from arrayList
	
}

//checking ArrayList is Empty
System.out.println("is ArrayList is Empty?"+al.isEmpty());

//remove  elements from ArrayList

ArrayList<String> al2=new ArrayList<String>();

al2.add("ram");
al2.add("reena");

al.removeAll(al2);
System.out.println("after removing multiple elements :"+al);

//remove all elements from arrayList

al.clear();
System.out.println("after removing all the elements from arrayList:"+al.isEmpty());
 



al.removeAll(al);


	}

}
