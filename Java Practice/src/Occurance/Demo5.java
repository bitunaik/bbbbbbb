package Occurance;

import java.util.HashSet;
import java.util.LinkedHashSet;
//remove duplicate character in the string
public class Demo5 {
public static void main(String[] args) {
	String s="wxxxelllcomeeeww";
	LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
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
		System.out.print(i);
	}
	
}
}
