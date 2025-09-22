package collectiondemo;

import java.util.Stack;

public class StackDemo {
         
	 public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();

	        stack.push(10);                      // add
	        stack.push(20);
	        stack.push(30);

	        System.out.println(stack.pop());     // remove last → 30
	        System.out.println(stack.peek());    // top element → 20
	        System.out.println(stack.isEmpty()); // false
}
}