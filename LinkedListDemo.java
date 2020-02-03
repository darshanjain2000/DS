import java.util.*;
class LinkedListDemo
{
	Node head;
	void insertatbeg(int item)
	{
		Node newnode=new Node();
		newnode.data=item;
		newnode.next=head;
		head=newnode;
	}
	void deleteatbeg()
	{
		Node temp=head;
		head=head.next;
		temp.next=null;
	}
	void deleteatLast()
	{
		Node temp2=head.next;
		Node temp=head;
		while(temp2.next!=null)
		{
			temp2=temp2.next;
			temp=temp.next;
		}
		temp.next=null;
	}
	void insertatbet(int data,int newitem)
	{
		Node temp=head;
		while(temp.data!=data)
		{
			temp=temp.next;
		}

		Node newnode=new Node();
		newnode.data=newitem;
		newnode.next=temp.next;
		temp.next=newnode;
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
		LinkedListDemo list = new LinkedListDemo();
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
		System.out.println("\nour ll is:");
		list.printlist();
		list.deleteatbeg();
		System.out.println("\n"+"our ll after delete is:");
		list.printlist();
		System.out.println("\nEnter the data after u want to insert: 60");
		list.insertatbet(60,5000);
		list.printlist();
		System.out.println("\nafter delete at last:");
		list.deleteatLast();
		list.printlist();
	}

}
/*ALGO
	Node head
	insertatbeg(item)
	new Node
	newnode.data=item
	newnode.next=head
	head=new
*/