import java.io.*; 
import java.util.LinkedList; 
  
class linkedList
{
        public static void main(String[] args) {
                // declaring a LinkedList 
        LinkedList list = new LinkedList(); 
  
        // adding  elements 
        list.add("linked"); 
        list.add("list"); 
        list.add("using"); 
        list.add("peek"); 
  
        // printing the list 
        System.out.println("The initial list is :" + list); 
  
        // peek at the head of the list 
        // Prints 1st element, "Geeks" 
        System.out.println("Head of the list : " + list.peek());
        }
}