package bubbling;

public class AAA {
	static {
	int i=19;
	System.out.println(i);
	}
	{
		int j=18;
		System.out.println(j);
	}
	 public static void main(String[] args) {
		 	AAA a=new AAA();
		 	AAA b = new AAA();
	}
}
