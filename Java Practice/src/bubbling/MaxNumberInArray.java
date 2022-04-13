package bubbling;

public class MaxNumberInArray {
public static void main(String[] args) {
	int[]arr= {3,9,0,10};
	int fMax=arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>fMax) {
			fMax=arr[i];
		}	
	}
	System.out.println(fMax);
}
}
