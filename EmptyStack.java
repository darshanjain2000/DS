class StackArray
{
	int top = -1;
	int[] arr = new int[6];
	void push(int item)
	{
		if(isFull())
		{
			System.out.println(" OVerflow! No space");
		}
		else
		{
			top = top+1;
			arr[top] = item;
		}

}
int pop()
{
	if(isEmpty())
	{
		System.out.println(" Under flow! Stack is empty");
		return 0;
	}
	else
	{
		int temp = arr[top];
		top = top-1;
		return temp;
	}
}
int peek()
{
	if(isEmpty())
	{
		System.out.println(" Underflow");
		return 0;
	}
	else
	{
		return arr[top];
	}
}

Boolean isFull()
{
	if(top>=arr.length)
		return true;
	else 
		return false;
}

Boolean isEmpty()
{
	if (top<0)
		return true;
	else
		return false;
}
void printStack()
{
	System.out.println(" ");
	System.out.println(" ");

}