package bubbling;

public class FirstAndSecondMaxNumber {
	public static void main(String[] args) {
		int[]a= {60,5,6,80,4,88};
		int fMax=a[0];
		int sMax=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=fMax) {
				if(a[i]!=fMax) {
					sMax=fMax;
				}
				fMax=a[i];
			}
			else if(fMax==sMax || sMax<a[i]) {
				sMax=a[i];
			}
		}
		System.out.println(fMax+"    "+sMax);
	}
}
