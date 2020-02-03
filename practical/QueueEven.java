class QueueEven
{
	int front= -1;
	int rear= -1;
	int[]arr=new int[6];

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
	int countEven()
	{
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
				count++;
		}
		return count;
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
			System.out.print(arr[temp]+" ");
			temp=temp+1;
		}
	}
	public static void main(String[] args) 
	{
		QueueEven queue =new QueueEven();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(2);
		queue.enqueue(50);
		queue.enqueue(6);
		System.out.println("\nthe queue is: ");
		queue.displayQueue();
		int no=queue.countEven();
		System.out.println("\ntotal no. of even elements in queue are: "+no);

	}

}
