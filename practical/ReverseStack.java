class ReverseStack
{
	int top=-1;
	int []arr=new int[3];
	void push(int item)
	{
		if(isFull())
			System.out.println("");
		else
		{
			++top;
			arr[top]=item;
		}
	}
	int pop()
	{
		if(isEmpty())
		{
			System.out.println("");
			return 0;
		}
		else
		{
			int temp=arr[top];
			top--;
			return temp;
		}
	}
	boolean isFull()
	{
		if(top>arr.length)
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
		for(int i=top;i>=0;i--)
			System.out.print(pop());
	}

	public static void main(String[] args) 
	{
		ReverseStack stack1=new ReverseStack();
		stack1.push(4);
		stack1.push(6);
		stack1.push(9);
		System.out.print("The no. is: ");
		stack1.printStack();
		ReverseStack stack2=new ReverseStack();
		stack2.push(stack1.pop());
		stack2.push(stack1.pop());
		stack2.push(stack1.pop());
		System.out.print("After reverse no. is: ");
		stack2.printStack();
	}
}