Public Node delAtPos(Node head,int pos){
int count=1;
Node temp=head;
while(count<pos){
temp=temp.next;
count++;
}
temp.prev.next=temp.next;
temp.next.prev=temp.prev;
return head;
}





//O(N)
