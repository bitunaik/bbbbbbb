package bubbling;

public class SwappingWithoutTemp {
public static void main(String[] args) {
	int a = 2;
	int b = 4;
	System.out.println("before swap "+a+" "+b);
	a= a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swap "+a+" "+b);
}
}