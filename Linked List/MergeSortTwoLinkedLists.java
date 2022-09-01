class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
       if(head==null || head.next==null)
       return head;
       
       Node fast=head,slow=head;
       while(fast.next!=null && fast.next.next!=null)
       {
           fast=fast.next.next;
           slow=slow.next;
       }
       
       Node head1= head;
       Node head2=slow.next;
       slow.next=null;
       
       head1=mergeSort(head1);
       head2=mergeSort(head2);
       
       Node newhead= merge(head1,head2);
       return newhead;
    }
    
    static Node merge(Node head1, Node head2)
    {
        if(head1==null)
        return head2;
        if(head2==null)
        return head1;
        
        Node head=null,tail=null;
        if(head1.data<=head2.data)
        {
            head=head1;
            tail=head1;
            head1=head1.next;
        }
        else
        {
            head=head2;
            tail=head2;
            head2=head2.next;
        }
        
        while(head1!=null && head2!=null)
        {
            if(head1.data<=head2.data)
            {
                tail.next=head1;
                head1=head1.next;
                tail=tail.next;
            }
            else
            {
                tail.next=head2;
                head2=head2.next;
                tail=tail.next;
            }
        }
        
        if(head1!=null)
        tail.next=head1;
        if(head2!=null)
        tail.next=head2;
        
        return head;
    }
}