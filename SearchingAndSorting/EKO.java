import java.util.*;
import java.lang.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		int wood = sc.nextInt();
 
		int[] heights = new int[n];
 
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			heights[i] = sc.nextInt();
			max = Math.max(max,heights[i]);
		}
 
		int start = 0,end = max;
		int ans = 0
 
		while(start<=end){
			int mid = start + (end-start)/2;
 
			if(isValid(mid,heights,wood)){
				start = mid + 1;
				ans = mid;
			}
			else
				end = mid - 1;
		}
		System.out.println(ans);
	}
 
	public static boolean isValid(int level,int[] heights,int wood){
		int woods = 0;
 
		for(int num:heights){
			if(num>=level)
				woods += (num - level);
		}
 
		if(woods>=wood)
			return true;
		return false;
	}
}