package string_Programs;
//String objects created using new operator are
//also immutable although they are stored in the heap memory
//Once I tried to concatenate “J2EE” to an existing string “JAVA”, a new string object 
//is created with “JAVAJ2EE” as it’s content.
//whatever way you create the string objects, either using string literals or using new operator, they are immutable.


public class Prove_String_is_Immutable {
/*
	public static void main(String[] args) {
		   String s1 = new String("JAVA");
		   
	        System.out.println(s1);         //Output : JAVA
	 
	        s1.concat("J2EE");
	 
	        System.out.println(s1);         //Output : JAVA
	    }
	}
*/
// means now both s1 and s2 are pointing to two different objects in the pool.
// Before modifications they are pointing to same object. Once we tried to
//change the content of the object using ‘s1’, a new object is created in the pool with “JAVAJ2EE” as it’s content and it’s reference is assigned to s1. If the strings are mutable, both s1 and s2 should point to same object even after modification. That never happened here. That proves the string objects are immutable in java.



    public static void main(String[] args)
    {
        String s1 = "JAVA";
 
        String s2 = "JAVA";
 
        System.out.println(s1==s2);//Output : true
 
        s1 = s1 + "J2EE";
 
        System.out.println(s1 == s2);//Output :false
        
    }}
