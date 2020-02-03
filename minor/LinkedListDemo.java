//Program to perform insertion and deletion at the beginning of a Linked List
class LinkedListDemo{
	Node head;
	void insertAtBeg(int item){
		Node newNode = new Node();
		newNode.data = item;
		newNode.next = head;
		head = newNode;
	
	}
	void deleteAtBeg(){
		Node temp = head;
		head = head.next;
		temp.next = null;
	}
	void printList(){
		Node temp = head;
		while(temp != null){
			System.out.print("-> "+temp.data);
			temp = temp.next;
		}
	}
	public static void main(String[] args){
		LinkedListDemo list = new LinkedListDemo();
		list.insertAtBeg(10);
		list.insertAtBeg(20);
		list.insertAtBeg(30);
		list.insertAtBeg(40);
		list.insertAtBeg(50);
		list.insertAtBeg(60);
		System.out.println("Our Linked List is");
		list.printList();
		list.deleteAtBeg();
		System.out.println();
		System.out.println("List after Deleting one element from the begenning...");
		list.printList();
	}
}
	