package PracticeJava;

public class Program6 {
public static void main(String[] args) {
	int n=5;
	int count=5;
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=5;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<i;k++) {
			System.out.print(k);
		}
		for(int j=i;j>0;j--) {
			System.out.print(j);
	}
		System.out.println();
	}
}
}
