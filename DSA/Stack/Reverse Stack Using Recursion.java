import java.util.Stack;

public class Solution {
	public static void insertBottom(Stack <Integer> stack, int x){
		if(stack.isEmpty()){
		  stack.push(x);
		  return;
		}
		int n=stack.peek();
		stack.pop();
		insertBottom(stack, x);
		stack.push(n);
	}
	public static void reverse(Stack<Integer> stack){
		if(stack.isEmpty()){
			return;
		}
		int n=stack.peek();
		stack.pop();
		reverse(stack);
		insertBottom(stack, n);
	}
	public static void reverseStack(Stack<Integer> stack) {
		reverse(stack);
	}
}
