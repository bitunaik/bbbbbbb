package PracticeJava;

public class Program8 {
public static void main(String[] args) {
	
	for(int i=1;i<=5;i++) {
		char ch='A';
		for(int j=i;j<=5;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<i;k++) {
			System.out.print(ch++);
		}
		for(int j=i;j>0;j--) {
			System.out.print(ch--);
	}
		System.out.println();
	}
}
}
