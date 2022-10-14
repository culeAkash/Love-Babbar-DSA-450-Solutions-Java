class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	    int shortage = 0;
	    int balance = 0;
	    int start = 0;
	    
	    for(int i=0;i<petrol.length;i++){
	        balance += petrol[i] - distance[i];
	        
	        if(balance<0){
	            start = i + 1;
	            shortage += balance;
	            balance = 0;
	        }
	    }
	    
	    if(shortage+balance>=0)
	        return start;
	        
	   return -1;
    }
}