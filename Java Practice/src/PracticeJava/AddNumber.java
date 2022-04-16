package PracticeJava;

public class AddNumber {
public static void main(String[] args) {
	int n=5656;
	
	while(n>9) {
		int sum=0;
		while(n>0) {
			int temp=n%10;
			sum=sum+temp;
			n=n/10;
		}	
	n=sum;
	}
	System.out.println(n);
}
}
