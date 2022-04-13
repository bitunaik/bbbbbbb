package ReverseString;
//without using length function
public class Program4 {
public static void main(String[] args) {
	String s="welcome";
	int count=0;
	char[]conChar=s.toCharArray();
	for(char i:conChar) {
		count++;
	}
	for(int i=count-1;i>=0;i--) {
		System.out.println(s.charAt(i));
	}
}
}
