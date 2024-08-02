package javaprogram;

public class Encapsulation {
private double balance;

public double getBalance(){
	return balance;
}

public void setbal(double balance) {
	this.balance=balance;
	System.out.println(balance);
}
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setbal(100);
		//System.out.println(e.getBalance());//1 st way
		System.out.println(e.balance);//2 nd way
		//double d = e.getBalance();//or 2 nd way  
		//System.out.println(d);
		
		
	}

}
