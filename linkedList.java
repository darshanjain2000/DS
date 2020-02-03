import java.io.*; 
import java.util.LinkedList; 
  
public class linkedList { 
   public static void main(String args[]) { 
  
      // creating an empty LinkedList 
      LinkedList list = new LinkedList(); 
  
      // use add() method to add elements in the list 
      list.add("Add"); 
      list.add("data"); 
      list.add("in"); 
      list.add("linked"); 
      list.add("list"); 
  
      // Output the present list 
      System.out.println("The list is:" + list); 
  
      // Adding new elements to the end 
      list.add("Last"); 
      list.add("Element"); 
  
      // printing the new list 
      System.out.println("The new List is:" + list); 
   } 
} 