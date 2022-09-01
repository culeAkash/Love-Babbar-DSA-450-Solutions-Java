/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node h1, Node h2){
        if(h1==null && h2==null)
            return null;
       
       Node first = reverseList(h1);
       Node second = reverseList(h2);
       
       Node head = null;
       Node tail = null;
       int carry =0;
       int sum = 0;
       
       while(first!=null && second!=null){
           sum = first.data + second.data + carry;
           
           carry = sum /10;
           int val = sum % 10;
           
           Node newNode = new Node(val);
           
           if(head==null){
               head = newNode;
           }
           else
                tail.next = newNode;
                
            tail = newNode;
            
            first = first.next;
            second = second.next;
       }
       
       while(first!=null){
           sum = first.data + carry;
           carry = sum /10;
           int val = sum % 10;
           
           Node newNode = new Node(val);
           
           if(head==null){
               head = newNode;
           }
           else
                tail.next = newNode;
                
            tail = newNode;
            
            first = first.next;
       }
       
       while(second!=null){
           sum = second.data + carry;
           carry = sum /10;
           int val = sum % 10;
           
           Node newNode = new Node(val);
           
           if(head==null){
               head = newNode;
           }
           else
                tail.next = newNode;
                
            tail = newNode;
            
            second = second.next;
       }
       
       if(carry==1){
           Node newNode = new Node(carry);
           
           if(head==null){
               head = newNode;
           }
           else
                tail.next = newNode;
                
            tail = newNode;
       }
       
       Node main = reverseList(head);
       return main;
       
       
       
    }
    
    static Node reverseList(Node head){
        if(head==null || head.next==null)
            return head;
            
        
        Node slow = null;
        Node fast = head;
        
        while(head!=null){
            fast = head.next;
            head.next = slow;
            slow = head;
            head = fast;
        }
        
        return slow;
    }
}