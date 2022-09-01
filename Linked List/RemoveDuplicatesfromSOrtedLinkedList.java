class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	    
	    if(head==null || head.next==null)
	        return head;
	        
	    Node slow = head;
	    Node fast = head.next;
	    while(fast!=null){
	       if(slow.data!=fast.data){
	            slow.next = fast;
	            slow = fast;
	       }
	       fast = fast.next;
	    }
	    slow.next = fast;
	    return head;
    }
}