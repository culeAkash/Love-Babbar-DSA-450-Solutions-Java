import java.util.*;
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        */
 
        // Write your code here
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int[] arr = new int[n];
        int[] sum = new int[n+1];
 
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
 
        int q = sc.nextInt();
        Arrays.sort(arr);

        sum[0] = 0;

        for(int i=1;i<=n;i++)
            sum[i] = sum[i-1] + arr[i-1];
 
        while(q-- > 0){
            int k = sc.nextInt();
            int count = binary(k,arr);
            System.out.println(count+" "+sum[count]);
        }
 
    }
 
    public static int binary(int k, int[] arr){
        int start = 0,end = arr.length-1;
 
        while(start<=end){
            int mid = start + (end-start)/2;
 
            if(arr[mid]>k){
                end = mid - 1;
            }
            else if(arr[mid]<=k){
                start = mid + 1;
            }
        }
        return start;
    }
}