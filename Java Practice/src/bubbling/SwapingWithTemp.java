package bubbling;

public class SwapingWithTemp {
public static void main(String[] args) {
	int a = 2;
	int b = 4;
	System.out.println("before swap "+a+" "+b);
	int temp=0;
	temp=a;
	a=b;
	b=temp;
	System.out.println("after swap "+a+" "+b);
}
}
