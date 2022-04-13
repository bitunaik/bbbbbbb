package PracticeJava;
//order should be different
public class MethodOverloading3 {
	void m1(int i, double d, String s) {
		System.out.println("Order should be different");
	}
	void m1(double d,int i, String s) {
		System.out.println("Order should be different");
	}
	void m1(int i, String s, double d) {
		System.out.println("Order should be different");
	}
}
