package javaprogram;
//use this keyword
public class ThisKeywordUse {
int a=10,b=20;
	void add() {
		System.out.println(a+b);
	}
	void sub(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		ThisKeywordUse t=new ThisKeywordUse();
		t.sub(30,20);
	}

}
