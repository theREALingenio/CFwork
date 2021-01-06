import java.io.*;
import java.util.*;

public class Contest661_B {
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tt = 0; tt < t; tt++){
            int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                minA = Math.min(minA,a[i]);
            }
            for (int i = 0; i < n; i++){
                b[i] = sc.nextInt();
                minB = Math.min(minB,b[i]);
            }
            long count = 0;
            for (int i = 0; i < n; i++){
                count += (long) Math.max(a[i]-minA,b[i]-minB);
            }
            System.out.println(count);
        }
    }
}