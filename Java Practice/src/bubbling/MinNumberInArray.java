package bubbling;

public class MinNumberInArray {
public static void main(String[] args) {
	int[]arr= {4,9,0,22};
	int fMin=arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]<fMin) {
			fMin=arr[i];
		}
	}
	System.out.println(fMin);
}
}
