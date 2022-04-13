package bubbling;

public class MaxNumberInArrayWithBubble {
	public static void main(String[] args) {
		int[]arr= {7,3,99,0};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println(arr[0]+" is Maximum number");
	}
}
