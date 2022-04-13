package ReverseString;
//without using length 
public class Program3 {
public static void main(String[] args) {
	String s="welcome";
	int count=0;
	for (int i = 0;true; i++) {
		try {
			s.charAt(i);
			count++;
		}
		catch(Exception e) {
			break;
		}
	}
	for(int i=count-1;i>=0;i--) {
		System.out.println(s.charAt(i));
	}
	
	
}
}
