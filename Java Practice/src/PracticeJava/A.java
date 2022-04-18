package PracticeJava;
//Has a Relationship??????????
public class A {
void m1() {
	System.out.println("A");
}
}
class B extends A
{
	void m2() {
		System.out.println("B");
	}
}
class C extends A{
	void m3() {
		B b= new B();
		b.m2();
	}
}
class D{
	public static void main(String[] args) {
		C c=new C();
		c.m3();
	}
}