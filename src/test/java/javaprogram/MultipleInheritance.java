  package javaprogram;

interface A{
	void a();
}
interface B{
	void b();
}

public class MultipleInheritance implements A,B{
	@Override
	public void b() {
	System.out.println("i am b");	
	}

	@Override
	public void a() {
		System.out.println("i am a");
		
	}
	public static void main(String[] args) {
		MultipleInheritance m=new MultipleInheritance();
		m.a();
		m.b();
	}

	

}
