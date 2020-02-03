class SimpleQueueList
{
	Node front=null;
	Node rear=null;
	void inserAtRear(int item)
	{
		Node newNode=new Node();
		if(newNode=null)
			System.out.println("Overflow!!");
		else
			{
				newNode.data=item;
				newNode.next=null;
				if(rear!=null)
					rear.next=newNode;
				rear=newNode;
				if(front=null)
					front=newNode;
			}
	}
	int deleteAtfront()
	{
		if(front=null)
		{
			System.out.println("undeerflow!!");
			return 0;
		}
		else
		{
			Node temp =front;
			int data = temp.data;
			front= temp.next;
			temp.next=null;
			temp=null;
			return data;
		}
	}
	void displayQueue()
	{
		Node temp=front;
		while(temp!=null)
		{
			System.out.print(temp.data);
			System.out.println("->");
			temp=temp.next;
		}

	}
}