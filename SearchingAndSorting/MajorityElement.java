class Solution
{
    static int majorityElement(int arr[], int size)
    {
        int count = 1;
        int elem = arr[0];
        
        for(int i=1;i<size;i++){
            if(elem!=arr[i])
                count--;
            else
                count++;
                
            if(count==0){
                elem = arr[i];
                count = 1;
            }
        }
        
        count = 0;
        for(int i=0;i<size;i++){
            if(arr[i]==elem)
                count++;
        }
        
        if(count>size/2)
            return elem;
        return -1;
    }
}