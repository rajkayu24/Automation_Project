 package javaprogram;
interface X{
	void a();
	void b();
	void c();
}

class Y implements X{

	@Override
	public void a() {
		System.out.println("hi i am a");
	}

	@Override
	public void b() {
		System.out.println("hi i am b");

		
	}

	@Override
	public void c() {
		System.out.println("hi i am c");

		
	}
	
}
public class AbstractionUsingInterface {

	
	public static void main(String[] args) {
		Y x=new Y();
		x.a();
		x.b();
		x.c();
	}

}
