package bubbling;

public class AddTwo {
public static void main(String[] args) {
	int[]a= {1,2,3};
	int[]b= {9,9,9};
	String temp=" ";
	
	for(int i=0;i<a.length;i++) {
		temp=temp+(a[i]+b[i]);
		}
		char[]ch=temp.toCharArray();
		for(int i=0;i<temp.length();i++) {
			System.out.print(temp.charAt(i)+" ");
		}
	}
}

