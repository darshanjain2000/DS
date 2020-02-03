class CircularQueueArray
{
	int front = -1;
	int rear = -1;
	int[] arr = new int[6];

	void enqueAtRear(int item)
	{
		if(isFull())
		{
			System.out.println("Overflow");
		}
		else
		{
			if(rear == arr.length-1)
				rear = 0;
			else
				rear = rear+1;
			arr[rear] = item;
			if(front == -1)
				front = 0;
		}
	}

	int dequeAtFront()
	{
		if(isEmpty())
		{
			System.out.println("Underflow");
			return 0;
		}
		else
		{
			int temp= arr[front];
			if(front==arr.length-1)
				front=0;
			else
				front+=1;
			return temp;
		}
	}
	int peekAtFront()
	{
		if(isEmpty())
		{
			System.out.println("UNDERFLOW!!!");
			return 0;
		}
		else
		{
			return arr[front];
		}
	}
	void displayQueue()
	{
		System.out.println("Queue elements are:");
		int temp =front;
		if(front<=rear)
		{
			while(temp<=rear)
				System.out.println(arr[temp++]+" ");
		}
		else
		{
			while(temp<=arr.length-1)
				System.out.println(arr[temp++]+" ");
			temp=0;
			while(temp<=rear)
				System.out.println(arr[temp++]+" ");
		}
	}
	boolean isFull()
	{
		if(((front==0)&&(rear==arr.length-1))||front==rear+1)
			return true;
		else
			return false;
	}
	boolean isEmpty()
	{
		if(front==-1)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		CirculaQueueArray que=new CirculaQueueArray();
		que.enqueAtRear(10);
		que.enqueAtRear(20);
		que.enqueAtRear(30);
		que.enqueAtRear(40);
		que.enqueAtRear(50);
		que.enqueAtRear(60);
		que.enqueAtRear(70);
		que.enqueAtRear(80);
		que.enqueAtRear(90);
		que.enqueAtRear(100);

		System.out.println("elements deleted from front is:"+que.dequeAtFront());

		que.enqueAtRear(5000);

		System.out.println("New element at front is:"+que.peekAtFront());

		que.displayQueue();
	}


}