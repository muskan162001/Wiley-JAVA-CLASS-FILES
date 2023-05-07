package Collections;

import java.util.Deque;
import java.util.*;

public class QueueClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String>q=new PriorityQueue<>();
		q.add("a");
		q.add("t");
		q.add("u");
		q.add("i");
		System.out.println(q);
		Deque<String>dq=new LinkedList<>();
		dq.add("a");
		dq.add("b");
		dq.addFirst("f");
		dq.add("n");
		dq.addLast("h");
		dq.add("v");
		System.out.println(dq);
		

	}

}