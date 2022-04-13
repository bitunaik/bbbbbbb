package PracticeJava;

public class Program5 {
public static void main(String[] args) {
	int count=0;
	for(int i=1;i<=5;i++) {
		for(int j=i;j<=5;j++) {
		
			System.out.print(count++ +" ");
		}
		System.out.println();
	}
}
}
