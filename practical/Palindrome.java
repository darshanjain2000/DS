class Palindrome
{
	Node top=null;
	Node top2=null;
	void push(int item)
	{
		Node newnode = new Node();
		if(newnode == null)
		{
			System.out.println("OVERFLOW!!! No more space left");
		}
		else
		{
			newnode.data = item;
			newnode.next = top;
			top = newnode;
		}
	}
	int pop()
	{
		if(top == null)
		{
			System.out.println("UNDERFLOW!!! Stack is empty");
			return 0;
		}
		else{
			Node temp = top;
			int data = temp.data;
			top = temp.next;
			temp = null;
			return data;
		}
	}
	void push2(int item)
	{
		Node newnode = new Node();
		if(newnode == null)
		{
			System.out.println("OVERFLOW!!! No more space left");
		}
		else
		{
			newnode.data = item;
			newnode.next = top2;
			top2 = newnode;
		}
	}
	int pop2()
	{
		if(top == null)
		{
			System.out.println("UNDERFLOW!!! Stack is empty");
			return 0;
		}
		else{
			Node temp = top2;
			int data = temp.data;
			top2 = temp.next;
			temp = null;
			return data;
		}
	}
	int check()
	{
		Node temp = top;
		Node temp2 = top2;
		while(temp.next!=null && temp2.next!=null)
		{
			if(temp.data==temp2.data)
				return 1;
			else
				return 0;
		}
	}
	public static void main(String[] args) 
	{
		Palindrome pal = new Palindrome();
		pal.push(1);
		pal.push(2);
		pal.push(1);
		Palindrome pal2 = new Palindrome();
		pal2.push2(pal.pop());
		pal2.push2(pal.pop());
		pal2.push2(pal.pop());

		int n=pal2.check();
		if(n==1)
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");
		
	}
}