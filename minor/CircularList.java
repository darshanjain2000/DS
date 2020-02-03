//Program to perform insertion and deletion at the beginning of a circular linked list
class CircularList{
	Node tail;
	void insertAtBeg(int item){
		Node newNode = new Node();
		newNode.data = item;
		if(tail == null){
			newNode.next = newNode;
			tail = newNode;
		}
		else{
			newNode.next = tail.next;
			tail.next = newNode;
		}
	}
	void deleteAtBeg(){
		Node temp = tail.next;
		tail.next = temp.next;
		temp.next = null;
	
	}
	void printList(){
		Node temp = tail.next;
		while(temp != tail){
			System.out.print("-> "+temp.data);
			temp = temp.next;
		}
		System.out.print("-> "+temp.data);
	}
	
	public static void main(String [] args){
		CircularList list = new CircularList();
		list.insertAtBeg(10);
		list.insertAtBeg(20);
		list.insertAtBeg(30);
		list.insertAtBeg(40);
		list.insertAtBeg(50);
		System.out.println("My Circular List is: ");
		list.printList();
		System.out.println();
		System.out.println("List after deletion from the beginning: ");
		list.deleteAtBeg();
		System.out.println("Updated list is: ");
		list.printList();
	}
}