package Occurance;

import java.util.LinkedHashSet;

//print the position 
public class Demo9 {
public static void main(String[] args) {
	String s="Tester";
	s=s.toLowerCase();
	LinkedHashSet<Character> set= new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++) {
		set.add(s.charAt(i));
	}
	for(Character i:set) {
		for(int j=0;j<s.length();j++) {
			if(i.equals(s.charAt(j))) {
				System.out.println(i+" "+(j+1));
				break;
			}
		}
	}
}
}
