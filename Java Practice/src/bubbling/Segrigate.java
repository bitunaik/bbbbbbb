package bubbling;

public class Segrigate {
public static void main(String[] args) {
	int[]arr= {1,0,5,1,0,1,1,0,2,2,4,4};
	int[]b=new int[arr.length];
	int m=0;
	int n=arr.length-1;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==0) {
			b[n]=arr[i];
			n--;
		}
		else {
			b[m]=arr[i];
			m++;
		}
		}
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i]);
	}
	}
}

