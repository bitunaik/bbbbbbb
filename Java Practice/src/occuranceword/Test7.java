package occuranceword;

//without length reverse
public class Test7 {
public static void main(String[] args) {
	String s="bb b bb";
	String[]s1=s.split(" ");
	String rev="";
	for(int i=s1.length-1;i>=0;i--) {
		rev=rev+s1[i]+" ";
	}
	System.out.println(rev);
	if(s==rev) {
		System.out.println("Given sentence is pallindrome");
	}
	else
		System.out.println("Not pallindrome");
	}

}

