//User function Template for Java

/*
class Node{
	int data;
	Node next, prev;
	Node(int data){
		this.data = data;
		next = null;
		prev = null;
	}
}
*/

class Solution{
	public Node rotateDLL(Node head, int p) {
		if(head==null || head.next==null)
		    return head;
		    
		Node prevNode=null,newHead = head, tail = null;
		
		int i=1;
		while(i<=p){
		    prevNode = newHead;
		    newHead= newHead.next;
		    i++;
		}
		
		tail = newHead;
		
		while(tail.next!=null){
		    tail = tail.next;
		}
		
		head.prev = tail;
		tail.next = head;
		prevNode.next = null;
		newHead.prev= null;
		
		return newHead;
	}
}