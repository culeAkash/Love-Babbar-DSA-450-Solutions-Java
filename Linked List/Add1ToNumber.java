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

class Solution
{
    public static Node addOne(Node head) 
    { 
        head= reverse(head);
        Node temp=head;
        temp.data=temp.data+1;
        Node prev=null;
        int carry=0;
        while(temp!=null)
        {
            int sum=temp.data+carry;
            carry=sum/10;
            temp.data=sum%10;
            prev=temp;
            temp=temp.next;
        }
        if(carry!=0)
        {
            Node newnode= new Node(carry);
            prev.next=newnode;
            newnode.next=null;
            
        }
        head=reverse(head);
        return head;
    }
    
    public static Node reverse(Node head)
    {
        Node prev=null,current=head,nextnode=head.next;
		
		while(nextnode!=null)
		{
			if(current==head)
			{
				current.next=null;
				
			}
			else
			{
				current.next=prev;
				
			}
			prev=current;
			current=nextnode;
			nextnode=nextnode.next;
		}
		current.next=prev;
		head=current;
		return head;
    }
}
