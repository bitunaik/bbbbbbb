package Occurance;

import java.util.HashSet;
import java.util.LinkedHashSet;
//occurance of characters in an string
public class Demo2 {
public static void main(String[] args) {
	String s="Hoolaa";
	LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++) {
		hs.add(s.charAt(i));      //hs = Hola
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