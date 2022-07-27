class Solution
{
    public static void sort012(int arr[], int n)
    {
        int i=0;
		int nextZ=0,nextT=n-1;
		while(i<=nextT)
		{
			if(arr[i]==0)
			{
				int temp=arr[nextZ];
				arr[nextZ]=arr[i];
				arr[i]=temp;
				nextZ++;i++;
			}
			else if(arr[i]==2)
			{
				int temp=arr[nextT];
				arr[nextT]=arr[i];
				arr[i]=temp;
				nextT--;
			}
			else {
				i++;
			}
			}
    }
}

// { Driver Code Starts.
