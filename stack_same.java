import java.util.*; 

class stack_same 
{ 

	static boolean isSameStack(Stack stack1,Stack stack2) 
	{  
		boolean flag = true; 
		if (stack1.size() != stack2.size()) 
		{ 
			flag = false; 
			return flag; 
		} 
		while (stack1.empty() == false) 
		{ 
			if (stack1.peek() == stack2.peek()) 
			{ 
				stack1.pop(); 
				stack2.pop(); 
			} 
			else
			{ 
				flag = false; 
				break; 
			} 
	} 
	return flag; 
} 
public static void main(String arr[]) 
{  
	Stack stack1 = new Stack(); 
	Stack stack2 = new Stack(); 

	stack1.push(10); 
	stack1.push(20); 
	stack1.push(30); 
	stack1.push(40); 
	stack1.push(50); 

	stack2.push(10); 
	stack2.push(20); 
	stack2.push(30); 
	stack2.push(40); 
	stack2.push(50); 

	if (isSameStack(stack1, stack2)) 
		System.out.println("Stacks are Same"); 
	else
		System.out.println("Stacks are not Same"); 

} 
} 
