package bubbling;

public class AddingTwoArray {
public static void main(String[] args) {
	int[]a= {2,4,1,6,8};
	int[]b= {1,5,7,3,8,0,9};
	int count=a.length;
	if(a.length<b.length) {
		count=b.length;
	}
	for(int i=0;i<count;i++) {
		try {
			System.out.print(a[i]+b[i]+" ");
		}
		catch (Exception e) {
			if(a.length>b.length) {
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(" "+b[i]);
			}
		}
	}
}
}