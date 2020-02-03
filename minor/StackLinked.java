// Implement Stack using LL
class StackLinked{
	Node top = null;
	void push(int item){
		Node newNode = new Node();
		if(newNode == null){
			System.out.println("OVERFLOW!!! No more space left");
		}
		else{
			newNode.data = item;
			newNode.next = top;
			top = newNode;
		}
	}
	int pop(){
		if(top == null){
			System.out.println("UNDERFLOW!!! Stack is empty");
			return 0;
		}
		else{
			Node temp = top;
			int data = temp.data;
			top = temp.next;
			temp = null;
			return data;
		}
	}
	int peek(){
		if(top == null){
			System.out.println("UNDERFLOW!!! Stack is empty");
			return 0;
		}
		else
			return top.data;
	}
	void printStack(){
		Node temp = top;
		System.out.print("[");
		while(top != null){
			System.out.print(pop()+" ");
			top=top.next;
		}
		System.out.print("]");
	}
	
	public static void main(String[] args){
		StackLinked link = new StackLinked();
		link.push(10);
		link.push(20);
		link.push(30);
		link.push(40);
		link.push(50);
		link.push(60);
		
		// Print the top element in my Stack
		System.out.println("Element at the top is: "+link.peek());
		
		// Delete top element from the Stack
		System.out.println("Element popped is: "+link.pop());
		
		//Print the whole Stack
		System.out.print("Elements in Stack are: ");
		link.printStack();
	}
	
}