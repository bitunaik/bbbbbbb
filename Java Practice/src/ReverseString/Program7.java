package ReverseString;

public class Program7 {
	public static void main(String[] args) {
		int a=121;
		int v=a;
		int rev=0;
		while(a!=0) {
			int c=a%10;
			rev=rev*10+c;
			a=a/10;
		}
		if(rev==v) {
			System.out.println("It is pallindrom");
		}
		else {
			System.out.println("It is not pallindrom");
		}
	
	}
}
