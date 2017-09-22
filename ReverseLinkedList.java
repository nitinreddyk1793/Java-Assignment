public class ReverseLinkedList {
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedListT a = new LinkedListT();
		a.addAtBegin(20);
		a.addAtBegin(30);
		a.addAtBegin(40);
		a.addAtBegin(50);
		a.addAtBegin(60);
		a.addAtBegin(70);
		a.display(a.head);
		Node prev=a.reverse(a.head);
		a.display(prev);
	
       
	}
}
class Node{
	public int data;
	
	public Node next;
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}
class LinkedListT{
	public Node head;
	public LinkedListT(){
		head=null;
	}

	public void addAtBegin(int data){
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	public Node reverse(Node head){
		Node currNode = head;
		Node nextNode = null;
		Node prevNode = null;

		while(currNode!=null){
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
		System.out.println("\n Reverse Through Iteration");
		return head;
	}
	public void display(Node head){
		Node currNode = head;
		while(currNode!=null){
			System.out.print("->" + currNode.data);
			currNode=currNode.next;
		}
	}
}
//Time complexity=O(n)
//Space complexity=O(n)
