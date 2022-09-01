/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
    
}*/
// you have to complete this function
class GfG
{
    public static Node quickSort(Node node)
    {
        if(node == null || node.next ==null)
            return node;
            
        Node tail = node;
        
        while(tail.next!=null){
            tail = tail.next;
        }
        
        sort(node,tail);
        
        return node;
    }
    
    static void sort(Node start,Node end){
        if(start==end || start==null || start== end.next)
            return;
            
        Node pivot_prev = partitionList(start,end);
        sort(start,pivot_prev);
        
        //if pivot prev is start or is not null then then start from next index
        if(pivot_prev!=null && pivot_prev==start)
            sort(pivot_prev.next,end);
        else if(pivot_prev!=null && pivot_prev!=start)//not null and in between the list
            sort(pivot_prev.next.next,end);
            
        
    }
    
    static Node partitionList(Node start,Node end){
        if(start==end || start==null || end==null)
            return start;
            
        Node pivot_prev = start;
        Node curr = start;
        int pivot = end.data;
        
        while(start!=end){
            if(pivot>start.data){
                pivot_prev = curr;
                int temp = curr.data;
                curr.data = start.data;
                start.data = temp;
                curr = curr.next;
            }
            start = start.next;
        }
        
        int temp = end.data;
        end.data = curr.data;
        curr.data = temp;
        
        return pivot_prev;
    }
    
    
}