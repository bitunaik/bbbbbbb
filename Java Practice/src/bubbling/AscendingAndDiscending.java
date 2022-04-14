package bubbling;

public class AscendingAndDiscending {
public static void main(String[] args) {
	int[] arr= {6,5,2,8};
	for (int i = 0; i < arr.length; i++) {
		for (int j = 1+i; j < arr.length; j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("Ascending order---->");
	for (int i =0;i<arr.length;i++) {
		System.out.print(arr[i]+" "); //ascending order
	}
	System.out.println();
	System.out.println("Discending order---->");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+" "); //descending order
	}
}
}
