package ReverseString;
//pallindrom of string
public class Program6 {
	public static void main(String[] args) {
		String s="bob";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s)) {
			System.out.println("Given String is Pallindrom");
		}
		else
		{
			System.out.println("Given String is not Pallindrom");
		}
	}
}
