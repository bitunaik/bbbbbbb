package Occurance;

import java.util.HashSet;

public class Demo8 {
public static void main(String[] args) {
	String s="khatam tata bye bye";
	String[]s1=s.split(" ");
	HashSet<String> hs=new HashSet<String>();
	for(int i=0;i<s1.length;i++) {
		hs.add(s);      //hs = Hola
	}
	for(String i:hs) {
		int count=0;
		for(int j=0;j<s1.length;j++) {
			if(i.equals(j)) {
				count++;
			}
		}
	
		System.out.println(i+"="+count);
		
	}
}
}
