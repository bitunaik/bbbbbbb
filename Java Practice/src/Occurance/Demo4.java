package Occurance;

import java.util.HashSet;
import java.util.LinkedHashSet;
//occurence of duplicae and unique character
public class Demo4 {
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
			if(count==1) {
			System.out.println("unique character is  "+i);
			}
			else {
				System.out.println("duplicate character is  "+i);
			}
		}	
	}
}
