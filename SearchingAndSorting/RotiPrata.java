import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int parathas = sc.nextInt();

            int n = sc.nextInt();
            int[] ranks = new int[n];
            
            int min = Integer.MAX_VALUE;

            for(int i=0;i<n;i++){
                ranks[i] = sc.nextInt();
                min = Math.min(min,ranks[i]);
            }

            int start = 0,end = (parathas*(parathas+1)*min)/2;
            int ans = -1;

            while(start<=end){

                int mid = start + (end - start)/2;

                if(isValid(mid,parathas,ranks))
                {
                    ans = mid;
                    end = mid - 1;
                }
                else
                    start = mid + 1;
            }

            System.out.println(ans);
        }
    }

    private static boolean isValid(int mid, int parathas, int[] ranks) {
        int ans  = 0;

        for(int i=0;i<ranks.length;i++){
            int time = ranks[i];
            int temp = ranks[i];
            while(time<=mid){
                ans ++;
                temp += ranks[i];
                time += temp;
            }
        }

        return ans>=parathas ? true : false;
    }
}