package occuranceword;

import java.util.LinkedHashSet;
//occurence of word
public class Test1 {
public static void main(String[] args) {

		String s="khatam tata bye bye";
		String[]s1=s.split(" ");
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for(String i:s1) {
			hs.add(i);   
		}
		for(String i:hs) {
			int count=0;
			for(String j:s1) {
				if(i.equals(j)) {
					count++;
				}
			}
			
			System.out.println(i+"="+count);
			
		}
	
}
}
