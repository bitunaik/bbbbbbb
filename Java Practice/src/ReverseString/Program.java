package ReverseString;

public class Program {
public static void main(String[] args) {
	String s= "welcome";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=s.charAt(i)+rev;
		
	}
	System.out.println(rev);
}
}
