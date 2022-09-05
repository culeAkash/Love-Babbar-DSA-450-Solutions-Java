     Following is the class structure of the Node class:

       class Node {
	int data;
	Node next;
	Node child;

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.child = null;
	}
}

*****************************************************************/
public class Solution {
	public static Node flattenLinkedList(Node start) {
		if(start==null)
            return start;
        
        Node nextHead = flattenLinkedList(start.next);
        
        Node head = null,tail = null;
        start.next = null;
        
        while(start!=null && nextHead!=null){
            if(head==null){
                head = start.data<=nextHead.data?start:nextHead;
                tail = head;
            }
            else{
                tail.child = start.data<=nextHead.data?start:nextHead;
                tail = tail.child;
            }
            
            if(start.data<=nextHead.data)
                start = start.child;
            else
                nextHead = nextHead.child;
        }
        
        while(start!=null){
            if(head==null){
                head = start;
                tail = start;
            }
            else{
                tail.child = start;
                tail = tail.child;
            }
            start = start.child;
        }
        
        while(nextHead!=null){
            if(head==null){
                head = start;
                tail = start;
            }
            else{
                tail.child = nextHead;
                tail = tail.child;
            }
            nextHead = nextHead.child;
        }
        return head;
        
	}
}

