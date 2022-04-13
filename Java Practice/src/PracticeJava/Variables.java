package PracticeJava;

public class Variables {
int x = 10;
static int y = 20;
public void test() {
	System.out.println(this.x);
	System.out.println(this.y);
	System.out.println(x);
	Variables v = new Variables();
	System.out.println(v.x);
	System.out.println(v.y);
	System.out.println(y);
	System.out.println(Variables.y);
}
public static void test1() {
	
	Variables v = new Variables();
    System.out.println(v.x);
    System.out.println(y);
    System.out.println(v.y);
    System.out.println(Variables.y);
}

}
