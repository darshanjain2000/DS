class StackArray{
	int top = -1;
	int[] arr = new int[6];
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

	int peek()
	{
		if(isEmpty())
		{
			System.out.println("UNDERFLOW");
			return 0;
		}
		else
		{
			return arr[top];
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
		System.out.println("[");
		for(int i = top; i >= 0; i--)
		{
			System.out.println(pop()+" ");
		}
	}
}