// Java implementation of the approach 
import java.util.Stack; 
class del_even_stack { 

	// Utility function to print 
	// the contents of a stack 
	static void printStack(Stack<Integer> stack) 
	{ 
		while (!stack.isEmpty()) 
			System.out.print(stack.pop() + " "); 
	} 

	// Function to delete all even 
	// elements from the stack 
	static void deleteEven(Stack<Integer> stack) 
	{ 
		Stack<Integer> temp = new Stack<>(); 

		// While stack is not empty 
		while (!stack.isEmpty()) { 
			int val = stack.pop(); 

			// If value is odd then push 
			// it to the temporary stack 
			if (val % 2 == 1) 
				temp.push(val); 
		} 

		// Tranfer the contents of the temporary stack 
		// to the original stack in order to get 
		// the original order of the elements 
		while (!temp.isEmpty()) 
			stack.push(temp.pop()); 

		// Print the modified stack content 
		printStack(stack); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		Stack<Integer> stack = new Stack<>(); 
		stack.push(16); 
		stack.push(15); 
		stack.push(29); 
		stack.push(24); 
		stack.push(19); 

		deleteEven(stack); 
	} 
} 
