class Solution {
    public ListNode deleteDuplicates(ListNode head) {
 if(head == null) return null;
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur != null){
            if(cur.val == pre.val){
                pre.next = cur.next;
                cur = cur.next;
            }
            else{
                pre = pre.next;
                cur = pre.next;
            }
        }
        return head;
        
    }
}





//O(n)
