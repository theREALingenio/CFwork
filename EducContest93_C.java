import java.io.*;
import java.util.*;

public class EducContest93_C {
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            long ans = 0;
            int temp = 0;
            HashMap<Integer,Integer> map = new HashMap();
            map.put(0,1);
            for (int i = 0; i < n; i++){
                temp += s.charAt(i) - '0';
                ans += map.getOrDefault(temp-i-1,0);
                map.put(temp-i-1,map.getOrDefault(temp-i-1,0)+1);
            }
            System.out.println(ans);
        }
    }

}