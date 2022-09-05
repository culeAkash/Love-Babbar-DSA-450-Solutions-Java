class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	if(head==null)
    	    return -1;
    	    
    	   Node first = head,second = head;
    	   for(int i=0;i<n;i++){
    	       if(second==null)
    	            return -1;
    	        second = second.next;
    	   }
    	   
    	   while(second!=null){
    	       first = first.next;
    	       second = second.next;
    	   }
    	   
    	   return first.data;
    }
}
