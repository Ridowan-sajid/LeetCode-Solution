import java.util.* ;
import java.io.*; 
public class Solution {
	public static void s(Stack<Integer> stack, int val){
		if(stack.isEmpty()){
			stack.push(val);
			return;
		}
		if(stack.peek()<val){
			stack.push(val);
			return;
		}

		int n=stack.peek();
		stack.pop();
		s(stack, val);
		stack.push(n);

	}
	public static void sort(Stack<Integer> stack){
		if(stack.isEmpty()){
			return;
		}
		int n=stack.peek();
		stack.pop();
		sort(stack);
		s(stack,n);
	}
	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		sort(stack);
	}

}
