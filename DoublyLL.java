package Day6;

public class DoublyLL 
{     
	 private Node head;
	
	  class Node
	{
		int data;
		Node next;
		Node prev;
		
		public Node(int data)
		{
			this.data = data;
		}
		
		public Node(int data, Node next, Node prev) {
			
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
	}
	
	public void insert(int data)
	{
		Node node = new Node(data);
		node.next = head;
		node.prev = null;
		if(head!= null)
		{
			head.prev = node;
		}
		head = node;
	}
	public void display()
	{
		Node node = head;
		Node last = null;
		while(node != null)
		{
			System.out.print(node.data + " ");
			last=node;
			node = node.next;
		}
		System.out.println();
		
		System.out.println("Print in reverse :");
		while(last != null)
		{
			System.out.print(last.data + " ");
			last = last.prev;
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		DoublyLL dl = new DoublyLL();
		dl.insert(10);
		dl.insert(26);
		dl.insert(14);
		dl.insert(7);
		dl.display();
		
	}
	 

}
