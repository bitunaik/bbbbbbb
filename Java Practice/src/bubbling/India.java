package bubbling;

public class India {
public static void main(String[] args) {
	String s="india";
	String[]s1=s.split("");
	for(int i=0;i<s.length();i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(s1[j]);
		}
		System.out.println();
	}
}
}
