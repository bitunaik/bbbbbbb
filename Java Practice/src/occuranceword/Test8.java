package occuranceword;

public class Test8 {
public static void main(String[] args) {
	String s="khatam tata bye bye";
	String[]s1=s.split(" ");
	for(String i:s1) {
		String rev="";
		for(int j=i.length()-1;j>=0;j--) {
			rev=rev+i.charAt(j);
		}
		System.out.print(rev+" ");
	}	
}
}
