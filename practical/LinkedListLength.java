class LinkedListLength
{
	Node head;
	void insertatbeg(int item)
	{
		Node newnode=new Node();
		newnode.data=item;
		newnode.next=head;
		head=newnode;
	}
	int count()
	{
		Node temp=head;
		int c=0;
		while(temp!=null)
		{
			c++;
			temp=temp.next;
		}
		return c;
	}
	void evenOdd(int count)
	{
		if(count%2==0)
			System.out.println("its even");
		else
			System.out.println("its odd");
	}
	void printlist()
	{	
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
	public static void main(String[] args) 
	{
		LinkedListLength list = new LinkedListLength();
		list.insertatbeg(10);
		list.insertatbeg(20);
		list.insertatbeg(30);
		list.insertatbeg(40);
		list.insertatbeg(50);
		list.insertatbeg(60);
		list.insertatbeg(70);
		list.insertatbeg(80);
		list.insertatbeg(90);
		list.insertatbeg(100);
		System.out.println("list is:");
		list.printlist();
		int count=list.count();
		System.out.println("\n");
		System.out.println("total no. of elements in linked list are:"+count);
		list.evenOdd(count);
		
	}
}