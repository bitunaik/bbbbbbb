package bubbling;

public class BobbleShotAscesnding {
public static void main(String[] args) {
	int[] arr= {30,20,40,10};
	for (int i = 0; i < arr.length; i++) {
		for (int j = 1+i; j < arr.length; j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for (int i : arr) {
		System.out.print(i+" "); //ascending order
	}
}
}
