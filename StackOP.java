package Day6;

import java.util.Stack;

public class StackOP 
      {
	     public static void main(String[] args) 
	      {
			Stack<Integer> st = new Stack<Integer>();
			//Adding 
			st.push(23);
			st.push(12);
			st.push(67);
			st.push(28);
			st.push(98);
			System.out.println(st);
			
			//Removing
			st.pop();
			st.pop();
			System.out.println(st);
			
			//searching
			System.out.println("Element 28 is inside the stack at :"+st.search(28));
			
			//Top most element
			System.out.println("Top element is :"+st.peek());
			
			//clearing
			st.clear();
			System.out.println(st);
			
		}
	}



