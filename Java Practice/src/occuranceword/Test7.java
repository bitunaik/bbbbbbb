package occuranceword;

import java.util.LinkedHashSet;
//without length reverse
public class Test7 {
public static void main(String[] args) {
	String s="khatam tata bye bye";
	String[]s1=s.split(" ");
	int count=0;
	LinkedHashSet<String> lh=new LinkedHashSet<String>();
	for(String i:s1) {
		count++;
	}
	//System.out.println(count);
	for(int i=count-1;i>=0;i--) {
		System.out.print(s1[i]);
	}
	}
}

