class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         Node h1 = head1, h2 = head2;
    while(h1 != h2)
    {
        h1 = h1 == null ? head2 : h1.next;
        h2 = h2 == null ? head1 : h2.next;
    }
    
        if(h1==null)
            return -1;
        
        return h1.data;
	}
}