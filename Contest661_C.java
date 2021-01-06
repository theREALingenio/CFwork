import java.io.*;
import java.util.*;

public class Contest661_C {
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tt = 0; tt < t; tt++){
            int n = sc.nextInt();
            int A[] = new int[n];
            HashMap<Integer,Integer> map = new HashMap();
            for (int i = 0; i < n; i++){
               A[i] = sc.nextInt();
               map.put(A[i],map.getOrDefault(A[i],0)+1);
            }
            Arrays.sort(A);
            if (n <= 1 ){
                System.out.println(0);
                continue;
            }
            if (n <= 3){
                System.out.println(1);
                continue;
            }
            int ans = 0;
            for (int s = A[0]+A[1]; s <= A[A.length-2]+A[A.length-1]; s++){
                int count = 0;
                for (Map.Entry e : map.entrySet()){
                    int key = (int) e.getKey();
                    if (2*key <= s && map.containsKey(s-key)){
                        if (2*key == s){
                            count += map.get(key)/2;
                        }else{
                            count += Math.min(map.get(key),map.get(s-key));
                        }
                    }
                }
                ans = Math.max(ans,count);
            }
            System.out.println(ans);
        }
    }
}