package bubbling;

public class FirstAndSecondMinNumber {
public static void main(String[] args) {
	int[]a= {100,0,200,200,900,500,900,700};
	int fMin=a[0];
	int sMin=a[0];
	for (int i = 0; i < a.length; i++) {
		if(a[i]<=fMin) {
			if(a[i]!=fMin) {
				sMin=fMin;
			}
			fMin=a[i];
		}
		else if(fMin==sMin || sMin>a[i]) {
			sMin=a[i];
		}
	}
	System.out.println("First minimum number is "+fMin);
	System.out.println("Second minimum number is "+sMin);
}
}
