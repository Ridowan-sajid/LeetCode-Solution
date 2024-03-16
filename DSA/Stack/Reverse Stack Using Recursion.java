import java.util.Stack;

public class Solution {
	  public static void solve(Stack <Integer> stack, int x){
        if(stack.isEmpty()){
          stack.push(x);
          return;
        }
        int n=stack.peek();
        stack.pop();
        solve(stack, x);
        stack.push(n);
  }
    public static void reverse(Stack<Integer> stack){
		if(stack.isEmpty()){
			return;
		}
		int n=stack.peek();
		stack.pop();
		reverse(stack);
		solve(stack, n);

	}
	public static void reverseStack(Stack<Integer> stack) {
		reverse(stack);
	}

}
