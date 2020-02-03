public class Newtop 
{
	int top = -1;
	int index = 0;
	final int MAX = 100;
	int[] tree = new int[MAX];			
	int[] stack = new int[MAX];			
	
	void insertNode(int item){
		if(index >= tree.length-1){
			System.out.println("Overflow!! Can't add more Nodes.. Tree is full");
		}
		else{
			index = index + 1;
			tree[index] = item;
		}
	}
	void push_stack(int item){
		if(top == MAX-1)
			System.out.println("Overflow!! Tree size is full");
		else{
			top = top+1;
			stack[top] = item;
		}
	}
	void pop_stack(){
		if(top == -1){
			System.out.println("Underflow!! Tree is Empty");
			return '\u0000';
		}
		else{
			int temp = stack[top];
			top = top - 1;
			return temp;
		}
	}
	boolean stack_empty(){
		if(top == -1)
			return true;
		else
			return false;
	}
    public void topView(Node root) {
        if(root == null) 
        	return;
        leftSide(root);
        if(root.right != null)
            rightSide(root.right);
    }
    public void leftSide(Node leftRoot)
    {
        if(leftRoot.left != null)
            leftSide(leftRoot.left);
        System.out.print(leftRoot.data + " ");
        return;
    }
    public void rightSide(Node rightRoot)
    {
        System.out.print(rightRoot.data + " ");
        if(rightRoot.right != null)
            rightSide(rightRoot.right);
        return;
    }
    void pre_nrec(int index){
			char item;
			push_stack(tree[index]);
			while(!stack_empty()){			// Till Stack is not empty
				for(int i = 1; i <= tree.length-1; i++){
					if(stack[top] == tree[i])				// Check the index of top element
						index = i;
				}	
				item = pop_stack();
				System.out.print(item+" ");
				if(tree[getRightChild(index)] != '\0')	// Right Child
					push_stack(tree[getRightChild(index)]);
				if(tree[getLeftChild(index)] != '\0')		// Left Child	
					push_stack(tree[getLeftChild(index)]);
			}
		System.out.println();
	}
    public static void main(String[] args) 
    {
    	Newtop top = new Newtop();  
    	top.insertNode(1);
    	top.insertNode(2);
    	top.insertNode(3);
    	top.insertNode(4);
    	top.insertNode(5);
    	top.insertNode(6);
    	top.insertNode(7);
    	top.insertNode(8);
    	top.pre_nrec(1);
    	top.topview(root);
    	
    }
}
