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
 
        Long t = sc.nextLong();
        while(t-- > 0){
            Long n = sc.nextLong();
            Long q = sc.nextLong();
 
            List<Pair> list = new ArrayList<>();
 
            for(int i=0;i<n;i++){
                list.add(new Pair(sc.nextLong(),sc.nextLong()));
            }
 
            Collections.sort(list,(p1,p2)-> p1.first.compareTo(p2.first));
 
            int idx = 0;
            for(int i=1;i<n;i++){
                if(list.get(i).first<=list.get(idx).second)
                    list.get(idx).second = Math.max(list.get(i).second,list.get(idx).second);
                else
                    {
                        idx++;
                        list.set(idx,list.get(i));
                    }
            }
 
            while(q-- > 0){
                Long k = sc.nextLong();
                Long start = -1l;
                for(int i=0;i<=idx;i++){
                    if(k<=(list.get(i).second-list.get(i).first+1)){
                        start = (list.get(i).first)+k-1;
                        break;
                    }
                    else{
                        k = k - (list.get(i).second - list.get(i).first + 1);
                    }
                }
                System.out.println(start);
            }
            
        }
 
    }
}
 
class Pair{
    Long first;
    Long second;
 
    public Pair(Long f,Long s){
        first = f;
        second = s;
    }
}