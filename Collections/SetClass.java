package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hs=new HashSet<>();
		hs.add("java");
		hs.add("JAva");
		hs.add("mysql");
		hs.add("java");
		System.out.println(hs);
		
		TreeSet<String>ts=new TreeSet<>();
		ts.add("a");
		ts.add("d");
		ts.add("c");
		ts.add("z");
		ts.add("k");
		System.out.println(ts.first().compareTo(ts.last()));
		//ts.add(null);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet("k"));
		System.out.println(ts.tailSet("k"));
		System.out.println(ts.subSet("a","k"));
		System.out.println(ts.descendingSet());
		
		
		LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
		lhs.add(null);
		lhs.add(1);
		lhs.add(8);
		lhs.add(7);
		System.out.println(lhs);

	}

}