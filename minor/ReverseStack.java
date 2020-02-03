class ReverseStack
{
	int top = -1;
	int[] arr = new int[3];

	void push(int item)
	{
		if(isFull())
			System.out.println("OVERFLOW");
		else
		{
			top += 1;
			arr[top] = item;
		}
	}

	int pop()
	{
		if(isEmpty())
		{
			System.out.println("UNDERFLOW");
			return 0;
		}
		else
		{
			int temp = arr[top];
			top -= 1;
			return temp;
		}
	}
	boolean isFull()
	{
		if(top>=arr.length)
			return true;
		else
			return false;
	}

	boolean isEmpty()
	{
		if (top<0)
			return true;
		else
			return false;
	}

	void printStack()
	{
		for(int i = top; i >= 0; i--)
		{
			System.out.print(pop()+" ");
		}
	}
	public static void main(String[] args) 
	{
		ReverseStack stack1=new ReverseStack();
		ReverseStack stack2=new ReverseStack();
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		System.out.println("the no. is:");
		stack1.printStack();
		stack2.push(stack1.pop());
		stack2.push(stack1.pop());
		stack2.push(stack1.pop());
		System.out.println("After reverse no. is:");
		stack2.printStack();
	}
}