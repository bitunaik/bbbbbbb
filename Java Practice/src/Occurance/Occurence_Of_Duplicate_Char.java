package Occurance;

import java.util.HashSet;
import java.util.LinkedHashSet;
//Occurrence of duplicate character in an String
public class Occurence_Of_Duplicate_Char {
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
			if(count>1) {
			System.out.println(i+"="+count);
			}
		}	
	}
}
