package ReverseString;
//reverse string without length function and with variable
public class Program5 {
	public static void main(String[] args) {
		String rev="";
		String s="welcome";
		int count=0;
		char[]conChar=s.toCharArray();
		for(char i:conChar) {
			count++;
		}
		for(int i=count-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
