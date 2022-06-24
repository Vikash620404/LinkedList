public class Singlyll {
	Node head,tail;
	
	class Node{
		Node next;
		int data;
		public Node(int data) {
			this.data=data;
		}
	}
void create( int data) {
	Node newNode=new Node(data);
	 if (head == null)
	       head=tail=newNode;
	 else
	       tail.next=newNode;
	    tail=newNode;
	}

public void display() {
	Node temp=head;
	if(head==null) {
		return;
	}
		
	       while(temp!=null) {
	    	   System.out.println(temp.data);
	    	   temp=temp.next;
	       
		
	}
}
public  Node insertAtBegning(int data) {
	Node newNode=new Node(data);
		if(head==null) {
			return newNode;
		
	}
		newNode.next=head;
		head=newNode;
		return head;
	
}


	public static void main(String[] args) {
		
		Singlyll sll=new Singlyll();	
		sll.create(1);
		sll.create(2);
		sll.create(3);
		sll.create(4);
		sll.create(5);
		
		sll.display();
		

	}

}
