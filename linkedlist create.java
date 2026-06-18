package linkedlist;

class Node
{
	int data ;
	Node ptr;
	Node(int data)
	{
		this.data = data;
		ptr = null;
	}
}

public class Main {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(20);
		head.ptr = second;
		second.ptr = third;
		
		System.out.println("Linked List Created");
		
		Node newnode = new Node(5);
		
		newnode.ptr = head;
		head = newnode;
		System.out.println("Linked");		
	}

}
