public Node insertAtBeg(Node head,Node newNode){
if(head==null) return newNode;
head.prev=newNode;
  head=newNode;
return head;

}




//O(1)
