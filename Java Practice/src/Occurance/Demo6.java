package Occurance;

import java.util.LinkedHashSet;
//print unique character and there index number/position
public class Demo6 {
public static void main(String[] args) {
	String s="welcome";
	LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++) {
		hs.add(s.charAt(i)); //hs=welcom
	}
	for(Character i:hs) {
		int count=0;
		for(int j=0;j<s.length();j++) {
			if(i.equals(s.charAt(j))) {
				count++;
			}
		}
		if(count==1) {
			System.out.println(i+" index is "+s.indexOf(i));
		}
	}
}
}
