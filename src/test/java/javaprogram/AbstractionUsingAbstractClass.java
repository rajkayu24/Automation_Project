package javaprogram;

 abstract class P{//(for abstract class only abstract public and final modifier
	 //can be used we can not use private  modifuier before abstract class)
	abstract void run();
	
	
}

class Q extends P{

	public void run() {
		System.out.println("i am runing");
		
	}
	
	
	 
}
public class AbstractionUsingAbstractClass{

public static void main(String[] args) {
		
P p=new Q();
p.run();

	}

}
