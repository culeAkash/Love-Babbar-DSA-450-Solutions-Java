/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        if(head1==null || head2==null)
            return null;
            
        Node head = null,tail = null;
        
        while(head1!=null && head2!=null){
            if(head1.data==head2.data){
                if(head==null){
                    head = head1;
                }
                else
                    tail.next = head1;
                    
                tail = head1;
                head1 = head1.next;
                head2 = head2.next;
            }
            else if(head1.data<head2.data)
                head1 = head1.next;
            else
                head2 = head2.next;
        }
        tail.next = null;
        return head;
    }
}