/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null)
            return null;
            
        if(head.next==null)
            return head;
            
        ListNode curr = head , nextNode = head , prev =null;
        
        int count = 1;
        
        while(count < m && curr!=null){
            prev = curr;
            curr = curr.next;
            nextNode = curr;
            count++;
        }
        
        ListNode t = curr , p = prev;
        
        while(count<=n && curr!=null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr =nextNode;
            count++;
        }
        
        t.next = curr;
        
        if(m==1){
            head = prev;
        }
        else
            p.next = prev;
            
        return head;
    }
}