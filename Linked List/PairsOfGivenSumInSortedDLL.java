public class Solution {

    public static boolean findPair(Node<Integer> head, int k) {
        Node<Integer> tail = head;
        while(tail.next!=null)
            tail = tail.next;
        
        while(head!=tail){
            if(head.data+tail.data==k)
                return true;
            else if(head.data+tail.data<k)
                head = head.next;
            else
                tail = tail.prev;
        }
        return false;
               
    }

}
