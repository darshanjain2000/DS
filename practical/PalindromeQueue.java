class PalindromeQueue
{
	int front= -1;
	int rear= -1;
	int[]arr=new int[3];
	void enqueue(int item)
	{
	 	if(isFull()){
	 		System.out.println("OverFlow!! Queue is Full");
	 	}
	 	else
	 	{
	 		if(front==-1);
	 		front=0;
	 		rear=rear+1;
	 		arr[rear]=item;
	 	}
	}
	int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("UnderFlow!! Queue is Empty");
			return 0;
		}
		else
		{
			int temp=arr[front];
			front=front+1;
			return temp;
		}
	}
	boolean isEmpty()
	{
		if(front==rear+1)
			return true;
		else
			 return false;
	}

	boolean isFull()
	{
		if(rear==arr.length-1)
			return true;
		else 
			return false;
	}
	void displayQueue()
	{
		int temp=front;
		while(temp!=rear+1)
		{
			System.out.print(arr[temp]+"");
			temp=temp+1;
		}
	}
	void check(PalindromeQueue queue1,PalindromeQueue queue3)
	{
		if(queue1!=queue3)
			System.out.println("\nno. is  palandrome");
		else
			System.out.println("\nno. is not palandrome");
	}
	public static void main(String[] args) 
	{
		PalindromeQueue queue1 = new PalindromeQueue();
		queue1.enqueue(1);
		queue1.enqueue(2);
		queue1.enqueue(1);
		System.out.println("\nthe no is: ");
		queue1.displayQueue();
		PalindromeQueue queue2 = new PalindromeQueue();
		queue2.enqueue(1);
		queue2.enqueue(2);
		queue2.enqueue(1);
		PalindromeQueue queue3 = new PalindromeQueue();
		queue3.enqueue(queue2.dequeue());
		queue3.enqueue(queue2.dequeue());
		queue3.enqueue(queue2.dequeue());
		System.out.println("\nafter reverse no. is: ");
		queue3.displayQueue();
		queue3.check(queue1,queue3);


	}
}