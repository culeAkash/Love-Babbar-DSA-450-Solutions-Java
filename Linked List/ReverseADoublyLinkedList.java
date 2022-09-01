public static Node reverseDLL(Node  head)
{
    if(head==null || head.next==null)
        return head;
    Node curr = head;
    Node prev = null;
    
    while(curr!=null){
        prev = curr;
        
        Node temp = curr.next;
        curr.next = curr.prev;
        curr.prev = temp;
        
        curr = curr.prev;
    }
    
    return prev;
}
