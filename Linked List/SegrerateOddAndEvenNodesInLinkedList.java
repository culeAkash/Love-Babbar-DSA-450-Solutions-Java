//User function Template for Java

/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution{
    Node divide(int N, Node head){
        if(head==null || head.next==null)
            return head;
            
        Node oddHead=null,oddTail=null,evenHead=null,evenTail=null;
        
        while(head!=null){
            if((head.data & 1) == 0){
                if(evenHead==null){
                    evenHead = head;
                    evenTail = head;
                }
                else{
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            }
            else{
                if(oddHead==null){
                    oddHead = head;
                    oddTail = head;
                }
                else{
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            }
            head = head.next;
        }
        
        if(evenTail!=null)
            evenTail.next = null;
            
        if(oddTail!=null)
            oddTail.next = null;
        
        if(evenHead==null)
            return oddHead;
        
        evenTail.next = oddHead;
        return evenHead;
    }
}