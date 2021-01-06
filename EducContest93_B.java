import java.io.*;
import java.util.*;

public class EducContest93_B {
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tt = 1; tt <= T; tt++){
            String s = sc.next();
            System.out.println(solve(s));
        }
    }
    public static int solve(String s){
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> b-a);
        int temp = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '1') {
                temp++;
            }else{
                pq.add(temp);
                temp = 0;
            }
        }
        pq.add(temp);
        while (!pq.isEmpty()){
            ans += pq.poll();
            if (!pq.isEmpty()){
                pq.remove();
            }
        }
        return ans;
    }
}