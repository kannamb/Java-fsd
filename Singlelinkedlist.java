package Linkedlist;

public class Singlylinkedlist {
	
		
		Node head; ///first node
		
		//inner class
		static class Node{
			int data;
			Node next;
			
			Node(int d){
				data=d;
				next=null;
			}
		}
		
		
		//method to create a new node
		public static Singlylinkedlist insert(Singlylinkedlist list,int data) {
			
			//create a node with given data
			
			Node new_node= new Node(data);
			new_node.next=null;
			
			
			///if the linked list is empty, then make the new node as head
			
			if(list.head==null) {
				list.head=new_node;		
			}else {
				///else it will travels till the last node and insert the new_node there
				Node last=list.head;
				while(last.next!=null) {
					last =last.next;
				}
				
				//Insert the new_node at the last node
				last.next=new_node;
			}
			
			return list;
		}
		
		
		public static void printList(Singlylinkedlist list) {
			
			Node currNode= list.head;
			System.out.print("LinkedList: ");
			///travells through linked list
			
			while(currNode!=null) {
				//print the data of current node
				System.out.print(currNode.data +" ");
				
				//go to the next node
				
				currNode=currNode.next;
			}
			
			System.out.println();
		}
		
		//Method to delete a node in the LinkedList by KEY
			public static Singlylinkedlist deleteByKey(Singlylinkedlist list, int key) {
				// Store head node
				Node currNode = list.head, prev = null;
				//to delete a first node
				if (currNode != null && currNode.data == key) {
					list.head = currNode.next; // Changed head
					System.out.println(key + " found and deleted");
					return list;
				}
				//to delete node between two nodes or last node
				while (currNode != null && currNode.data != key) {
					prev = currNode;
					currNode = currNode.next;
				} //execute until it founds a key or reaches to the last element of list
				//if key found
				if (currNode != null) {
					prev.next = currNode.next;
					System.out.println(key + " found and deleted");
				}
				//if key not found
				if (currNode == null) {
					System.out.println(key + " not found");
				}
				return list;
			}

		
		
		///prepare singly linked list
		public static void main(String[] args) {
			
			//starts with empty list
			
		Singlylinkedlist list =new Singlylinkedlist();
			
			//insert the values
			
			list= insert(list, 11);
			list=  insert(list, 11);
			list= insert(list, 12);
			list= insert(list, 13);
			list= insert(list, 14);
			list= insert(list, 15);
			list= insert(list, 16);
			list= insert(list, 17);

			printList(list);
			
			
			//delete node
			
			
			//deleting Head
			deleteByKey(list, 1);
			//print linked list
			printList(list);
			
			
			//delete by key 4
			deleteByKey(list, 11);
			//print linked list
			printList(list);
			
			//delete by key 10-- gives out put that key is not found
			deleteByKey(list, 17);
			//print linked list
			printList(list);
			
		}

}
