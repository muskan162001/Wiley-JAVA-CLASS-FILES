package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.*;


public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("s");
		al.add(1);
		al.add("string is here");
		al.add(2);
		al.add(1.22);
		al.add(null);
		
		al.remove(2);//remove element at ind 2;
		System.out.println(al);
		
		ArrayList<Integer>all=new ArrayList<>();
		all.add(3);
		all.add(234567);
		Enumeration<Integer>ev=Collections.enumeration(all);
		while(ev.hasMoreElements()) {
			System.out.println(ev.nextElement());
		}
	    Iterator<Integer>li=all.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		//all.add("f");not possible it is type safe;
		List<String> progLanguages = new ArrayList<>();
		progLanguages.add("Java");
		progLanguages.add("C");
		progLanguages.add("C++");
		progLanguages.add("Python");
		progLanguages.add("JavaScript");
		
		// getting listiterator 
		ListIterator<String> listIterator = progLanguages.listIterator();
		System.out.println("Forward Direction Iteration:");
		
		// hasNext()
		// next()
		while(listIterator.hasNext()){
			String element = listIterator.next();
			System.out.println(element);
		}
		
		System.out.println("Backward Direction Iteration:");
		// previousNext()
		// previous()
		while(listIterator.hasPrevious()){
			String element = listIterator.previous();
			System.out.println(element);
		}	
			LinkedList ll=new LinkedList();
			ll.add(null);
			ll.add(4);
			ll.add(null);
			System.out.println(ll);
			
			Stack st=new Stack();
			st.push(null);
			st.push(4);
			st.push(null);
			System.out.println(st);
			
			Vector v=new Vector();
			v.add(null);
			
			final List<Integer>aln=new ArrayList<>();
			aln.add(1);
			aln.add(4);
			aln.remove(1);
			aln.set(0,3);
			System.out.println(aln);
			
			
		
	
	}

}