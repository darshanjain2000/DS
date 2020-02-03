// Implementing Stack using Arrays
class StackArray{
	
	int[] arr = new int[6];
	void push(int item){
		if(isFull()){		// Overflow
			System.out.println("OVERFLOW!!! No more space left");
		}
		else{
			top = top+1;
			arr[top] = item;
		}
	}
	int pop(){
		if(isEmpty()){	// Underflow
			System.out.println("UNDERFLOW!!! Stack is Empty");
			return 0;
		}
		else{
			int temp = arr[top];
			top = top-1;
			return temp;
		}
	}
	int peek(){
		if(isEmpty()){	// Underflow
			System.out.println("UNDERFLOW!!! Stack is Empty");
			return 0;
		}
		else
			return arr[top];
	
	}
	boolean isEmpty(){
		if(top < 0)			
			return true;
		else	
			return false;
	}
	boolean isFull(){
		if(top >= arr.length)
			return true;
		else
			return false;
	}
	void printStack(){
		System.out.print("[");
		for(int i = top; i >= 0; i--){
			System.out.print(pop()+" ");
		}
		System.out.print("]");
	}
	public static void main(String[] args){
		int top = -1;
		StackArray stack = new StackArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		// Get the top element of the Stack
		System.out.println("Top element is: "+stack.peek());
		
		//Delete the top element 
		System.out.println("Popped element is: "+stack.pop());
		
		//Print all the element in my Stack
		stack.printStack();
		
		System.out.println();
		
		stack.pop();
	}
}