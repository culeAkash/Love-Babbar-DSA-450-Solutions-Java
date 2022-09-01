
class GFG
{
    //This method returns the head of the LL after deleting node with value d.
    public static Node deleteNode(Node head,int d)
    {
        Node curr = head;
        while(curr.next.data!=d)
            curr = curr.next;
            
        curr.next = curr.next.next;
        return head;
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
        Node prev=null,curr=head,nxt=head.next;
        
        while(curr.next!=head){
            curr.next=prev;
            prev=curr;
            curr=nxt;
            nxt=nxt.next;
        }
        curr.next=prev;
        prev=curr;
        head.next=prev;
        return prev;
    }
}