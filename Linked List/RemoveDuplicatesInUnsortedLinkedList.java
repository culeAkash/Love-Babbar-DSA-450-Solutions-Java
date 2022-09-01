class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         Node newhead=null;
         Node tail=null;
         if(head==null){
             return head;
         }
         HashMap<Integer,Boolean> map= new HashMap<>();
         Node temp=head;
         while(temp!=null){
             if(!map.containsKey(temp.data)){
                 map.put(temp.data,true);
                 if(newhead==null){
                     newhead=temp;
                     tail=temp;
                 }
                 else{
                     tail.next=temp;
                     tail=tail.next;
                 }
             }
             temp=temp.next;
             tail.next=null;
         }
         return newhead;
    }
}
