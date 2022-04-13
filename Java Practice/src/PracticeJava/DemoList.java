package PracticeJava;

import java.util.ArrayList;

public class DemoList {
public static void main(String[] args) {
	ArrayList list= new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add('C');
	list.add("List");
	list.add(null);
	list.add(null);
	list.add(10);
	list.add(10);
	System.out.println(list);
	System.out.println(list.get(5));
}
}
