/*Node is defined as
class Node
{
    int data; 
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class GfG{
  /*You are required to complete this method */
   public long multiplyTwoLists(Node l1,Node l2){
          long num1 = 0, num2 = 0, mod = 1000000007;
          
          Node temp1 = l1;
          while(temp1!=null){
              num1 = ((num1*10)+temp1.data)%mod;
              temp1 = temp1.next;
          }
          
          Node temp2 = l2;
          while(temp2!=null){
              num2 = ((num2*10)+temp2.data)%mod;
              temp2 = temp2.next;
          }
          
          return (num1*num2)%mod;
          
          
   }
}