class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
            return true;
        
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //slow is now middle
        slow.next=reverse(slow.next);
        slow=slow.next;
        ListNode temp=head;
        while(slow!=null){
            if(temp.val!=slow.val)
                return false;
            slow=slow.next;
            temp=temp.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head){
        if(head==null)
            return head;
        
        ListNode prev=null,nextnode=null;
        while(head!=null){
            nextnode=head.next;
            head.next=prev;
            prev=head;
            head=nextnode;
        }
        return prev;
    }
}