package PracticeJava;

public class Triangle {
public static void main(String[] args) {
	for(int i=0;i<=3;i++) {
		for(int j=i;j<=3;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++) {
			System.out.print("*");
		}
		for(int l=0;l<i;l++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
