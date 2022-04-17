package Occurance;

import java.util.HashSet;
import java.util.LinkedHashSet;
//remove duplicate character in the string
public class Remove_Duplicate_Char {
public static void main(String[] args) {
	String s="wxxxelllcomeeeww";
	LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++) {
		hs.add(s.charAt(i));  
	}
	for(Character i:hs) {
		System.out.print(i);
	}
	
}
}
