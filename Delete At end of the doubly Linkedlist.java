public Node delAtEnd(Node head,Node tail){
Node temp=tail;
tail.prev.next=null;
tail=tail.prev;
  
return head;
}




//O(1)
