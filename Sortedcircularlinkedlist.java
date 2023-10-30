package Array;
public class Sortedcircularlinkedlist {
	static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}
	Node head;
	Circularlinkedlist() {
		head = null;
	}
	void sortedInsert(Node new_node) {
		Node current = head;
		if (current == null) {
			new_node.next = new_node;
			head = new_node;//insert newnode as first if the list is empty
		} 
		else if (current.data >= new_node.data) {
			while (current.next != head)
				current = current.next;
			current.next = new_node;
			new_node.next = head;
			head = new_node;
		} else {
			while (current.next != head && current.next.data < new_node.data)
				current = current.next;
			new_node.next = current.next;
			current.next = new_node;
		}
	}
	void printList() {
		if (head != null) {
			Node temp = head;
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != head);
		}
	}
	public static void main(String[] args) {
		Circularlinkedlist list = new Circularlinkedlist();
		int arr[] = new int[] { 67,43,56,7,8,89,23,54 };
		Node temp = null;
		for (int i = 0; i < 8; i++) {
			temp = new Node(arr[i]);
			list.sortedInsert(temp);
		}
		list.printList();
	}
}
