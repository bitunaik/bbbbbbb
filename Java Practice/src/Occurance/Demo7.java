package Occurance;

import java.util.LinkedHashSet;

public class Demo7 {
//public static void main(String[] args) {
//	String s="abcdabcdabcd";
//	char[]ch=s.toCharArray();
//	
//	for(int i=0;i<s.length();i++) {
//		for(int j=i+1;j<s.length();j++) {
//			if(ch[i]>ch[j]) {
//				char temp=ch[j];
//				ch[j]=ch[i];
//				ch[i]=temp;	
//			}
//		}
//	}
//	for(char i:ch) {
//		System.out.print(i);
//	}
//}
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
			System.out.println();	
		}
	}
}
