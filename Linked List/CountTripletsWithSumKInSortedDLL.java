public class Solution {
    public static int countTriplets(DLLNode head,int x){
        DLLNode tail = head;
        while(tail.next!=null)
            tail = tail.next;
        int count = 0;
        
        for(DLLNode t=head;t!=null;t=t.next){
            DLLNode first = t.next;
            count += getCount(first,tail,x-t.data);
        }
        return count;
    }
    public static int getCount(DLLNode head,DLLNode tail, int k) {
        if(head==null || tail==null)
            return 0;
        int count = 0;
        
        while(head!=tail && head!=null && tail.next!=head && tail!=null){
            if(head.data+tail.data==k){
                count++;
                head = head.next;
                tail = tail.prev;
            }
            else if(head.data+tail.data<k)
                head = head.next;
            else
                tail = tail.prev;
        }
        return count;
               
    }
}