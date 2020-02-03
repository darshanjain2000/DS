class DoublyLLDemo
{
	DoublyNode head;
	void insertatbeg(int item)
	{
		DoublyNode newnode=new DoublyNode();
		if(head==null)
		{
			newnode.prev=null;
			newnode.data=item;
			newnode.next=head;
			head=newnode;
		}
		else
		{
			newnode.prev=null;
			newnode.data=item;
			newnode.next=head;
			head=newnode;
		}
	}
	void deleteatbeg()
	{
		DoublyNode temp=head;
		head=head.next;
		temp.next.prev=null;//temp=temp.next;;prev=temp
		temp.next=null;
	}
	void insertatbet(int data,int newitem)
	{
		DoublyNode temp=head;
		while(temp.data!=data)
		{
			temp=temp.next;
		}
		DoublyNode newnode=new DoublyNode();
		newnode.prev=temp;
		newnode.data=newitem;
		newnode.next=temp.next;
		temp.next=newnode;
		temp.next.prev=newnode;
	}
	void printlist()
		{
			DoublyNode temp=head;
			while(temp!=null)
			{
				System.out.print("<-"+temp.data+"->");
				temp=temp.next;
			}
		}
	public static void main(String[] args) 
	{
		DoublyLLDemo list =new DoublyLLDemo();
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
		System.out.println("dll is:");
		list.printlist();
		System.out.println("\nAfter deletion");
		list.deleteatbeg();
		list.printlist();
		System.out.println("\nAfter Adding 5000 between 70 and 60");
		list.insertatbet(70,5000);
		list.printlist();
	}
}