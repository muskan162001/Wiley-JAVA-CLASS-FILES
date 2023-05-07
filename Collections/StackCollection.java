package Collections;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(6);
		if(st.isEmpty())
			System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());

	}

}