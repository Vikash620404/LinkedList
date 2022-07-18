public Node delAtbeg(Node head){
Node temp=head;
head=head.next;
head.prev=null;
return head;
}



//O(1)
