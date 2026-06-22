package Datas;

public class CircularLinkedList <T>{
	Node last;
	class Node
	{
		T data;
		Node next;
		Node(T val)
		{
			data = val;
			next = null;
		}
	}
	CircularLinkedList()
	{
		last = null;
	}
	
	public void insertAtBeginning(T val)
	{
		Node newNode = new Node(val);
		
		if(last == null)
		{
			newNode.next = newNode;
			last = newNode;
		}
		else
		{
			newNode.next = last.next;
			last = newNode;
			
		}
	}
	public void insertAtEnd(T val)
	{
		Node newNode = new Node(val);
		
		if(last == null)
		{
			newNode.next = newNode;
			last = newNode;
		}
		else
		{
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
			
		}
	}
	public void display()
	{
		Node temp = last.next;
		do {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
		while(temp != last.next);		
	}
	public T deleteBeginning()
	{
		if(last == null)
		{
			throw new IndexOutOfBoundsException("Delete");
			T temp = last.next.data;
			if(last.next == last)
			{
				last = null;
			}
			else
			{
				last.next = last.next.next;
			return temp;
			}
		}
	}
	public static void main(String[] args) {
		
		CircularLinkedList<String> list = new CircularLinkedList<>();
		

	}

}
