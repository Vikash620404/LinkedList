public Node insertAtEnd(Node head,Node tail,Node newNode){
if(head==null) return newNode;
tail.next=newNode;
newNode .prev=tail;
tail=newNode;
return head;
}




//O(1)
