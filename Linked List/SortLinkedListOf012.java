public class Solution {
	public static Node<Integer> sortList(Node<Integer> head) {
        if(head==null || head.next==null)
            return head;
        
        Node<Integer> temp = head;
        int a = 0 , b = 0;
        while(temp!=null){
            if(temp.data==0)
                a++;
            else if(temp.data==1)
                b++;
            temp = temp.next;
        }
        
        temp = head;
        
        while(temp!=null){
            if(a-- >0)
                temp.data = 0;
            else if(b-- >0)
                temp.data = 1;
            else temp.data = 2;
            temp = temp.next;
        }
        return head;
        
	}
}

//By changing links
/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        if(head==null || head.next==null)
            return head;
            
        Node zeroH = null,zeroT = null;
        Node oneH = null, oneT = null;
        Node twoH = null, twoT = null;
        
        while(head!=null){
            if(head.data==0){
                if(zeroH==null){
                    zeroH = head;
                    zeroT = head;
                }
                else{
                    zeroT.next = head;
                    zeroT = zeroT.next;
                }
            }
            else if(head.data==1){
                if(oneH==null){
                    oneH = head;
                    oneT = head;
                }
                else{
                    oneT.next = head;
                    oneT = oneT.next;
                }
            }
            else{
                if(twoH==null){
                    twoH = head;
                    twoT = head;
                }
                else{
                    twoT.next = head;
                    twoT = twoT.next;
                }
            }
            head = head.next;
        }
        
        if(zeroT!=null)
            zeroT.next = null;
            
        if(oneT!=null)
            oneT.next = null;
        if(twoT!=null)
            twoT.next = null;
            
        if(zeroH==null){
            if(oneH==null)
                return twoH;
            else
            {
                oneT.next = twoH;
                return oneH;
            }
        }
        else if(oneH==null){
            zeroT.next = twoH;
            return zeroH;
        }
        zeroT.next = oneH;
        oneT.next = twoH;
        return zeroH;
        
        
        
    }
}


