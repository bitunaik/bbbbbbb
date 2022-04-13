package occuranceword;

import java.util.HashSet;
//number of character occurence in an string
public class Test2 {
public static void main(String[] args) {
	String s="khatam tata bye bye";
	HashSet<Character> hs=new HashSet<Character>();
	for(int i=0;i<s.length();i++) {
		hs.add(s.charAt(i));   
	}
	for(Character i:hs) {
		int count=0;
		for(int j=0;j<s.length();j++) {
			if(i.equals(s.charAt(j))) {
				count++;
			}
		}
	
		System.out.println(i+"="+count);
		
	}
}
}
