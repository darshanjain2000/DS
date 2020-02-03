class PriorityQueue
{
	int front = -1;
	int rear = -1;
	int[] arr = new int[0];
	public static final int MAX = 1000;

	void enqueue(int item)
	{
		if(isFull())
			System.out.println("Overflow!");
		else
		{
			if(front == -1)
				front = 0;
			rear = rear + 1;
			arr[rear] = item;
		}
	} 

	int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Underflow");
			return 0;
		}
		else
		{
			int priority = MAX;
			int temp = 0;
			while(front != (rear+1))
			{
				if(priority > arr[front])
				{
					priority = arr[front];
					temp = front;
					front = front + 1;
				}
				else 
					front = front + 1;
			}
			arr[temp] = arr[rear];
			rear = rear - 1;
			front = 0;
			 return priority;

		}

	}

	boolean isEmpty()
	{
		if(front==rear+1||front==-1)
			return true;
		else
			return false;
	}
	boolean isFull()
	{
		if(rear==arr.length)
			return true;
		else
			return false;
	}
	void printQueue()
	{
		System.out.println(("["));
		while(front!=(rear+1))
			System.out.println(dequeue()+" ");
		System.out.println("]");
	}

	public static void main(String[] args) 
	{
		PriorityQueue que=new PriorityQueue();
		que.enqueue(3);
		que.enqueue(7);
		que.enqueue(1);//highest priority
		que.enqueue(8);
		que.enqueue(4);
		que.enqueue(2);
		que.enqueue(5);
		que.enqueue(9);	

		System.out.println("Queue element with the higher priority is:"+que.dequeue());
		System.out.println("Queue element with the 2nd priority is:"+que.dequeue());
		System.out.println("Queue elements:");
		que.dequeue();
	}
	
}