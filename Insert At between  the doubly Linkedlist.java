public Node insertAtPos(Node head,int pos,Node newNode){
Node temp=head;
int count=1;
while(count<pos-1){
temp=temp.next;
count++;
}
newNode .prev=temp;
newNode.next=temp.next;
temp.next=newNode;
newNode.next.prev=newNode;
return head;
}




//O(N)
