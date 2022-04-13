package PracticeJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class DemoMap {
public static void main(String[] args) {
	HashMap map = new HashMap<>();
	map.put(100, "A");
	map.put(300, "C");
	map.put(500, "D");
	map.put(700, "Er56"
			+ "");
	map.put(200, "B");
	System.out.println(map);

//	ArrayList list = new ArrayList<>(map.keySet());
//	Collections.reverse(list);
//	System.out.println(list);
	
	LinkedList l=new LinkedList<>(map.keySet());
	Collections.sort(l);
	System.out.println(l);
	
	Collections.reverse(l);
	System.out.println(l);
	
}
}
