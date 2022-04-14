package Occurance;

import java.util.LinkedHashSet;

public class Demo7 {

	public static void main(String[] args) {
		String s="abcd@@@abc@@@dabcd";
		LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			hs.add(s.charAt(i)); //hs=welcom
		}
		for(Character i:hs) {
			for(int j=0;j<s.length();j++) {
				if(i.equals(s.charAt(j))) {
					System.out.print(i);
				}
			}
			//System.out.println();	
		}
	}
}
