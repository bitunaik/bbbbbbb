package PracticeJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashMapp {
public static void main(String[] args) {
	HashSet hs=new HashSet<>();
	hs.add("aaaa");
	hs.add("bbb");
	Iterator<String> it=hs.iterator();
	while(it.hasNext()) {
		String value=it.next();
		if(value.contains("bbb")) {
			System.out.println(value);
		}
	}
	
}
}
