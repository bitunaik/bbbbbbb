package PracticeJava;

import java.util.HashSet;
import java.util.TreeSet;

public class DemoSet {
public static void main(String[] args) {
	HashSet set = new HashSet<>();
	set.add(10);
	set.add('A');//heterogeneous
	set.add(null); //null allowed only once
	set.add(20);
	set.add(50);
	set.add(90);
	set.add(100);
	set.add(10); //duplicate not allwed
	System.out.println(set); //[null, A, 50, 20, 100, 10, 90] insertion order not maintained
	
	TreeSet tree = new TreeSet<>();
	tree.add(10);
	//tree.add(null);   null is not allowed
	tree.add(10); //duplicate not allowed
	tree.add(90); // homogeneous in nature
	tree.add(10);
	tree.add(300);
	tree.add(10);
	tree.add(2);
	tree.add(10);
	System.out.println(tree); //[2, 10, 90, 300] sorting order
}
}
