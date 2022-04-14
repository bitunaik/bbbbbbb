package bubbling;

public class AdditionAscending {
public static void main(String[] args) {
	int[]a={9,0,3,7,88,9,5,34};
	for (int i = 0; i < a.length; i++) {
		for (int j =1+i; j < a.length; j++) {
			if(a[i]>a[j]) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	int sum = 0;
	for(int i = 0;i<3;i++) {
		sum=sum+a[i];
	}
	System.out.println("Sum of first 3 smallest number is "+sum);
}
}
