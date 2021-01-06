import java.io.*;
import java.util.*;

public class EducContest93_A {
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tt = 1; tt <= t; tt++){
            int n = sc.nextInt();
            int A[] = new int[n];
            for (int i = 0; i < n; i++){
                A[i] = sc.nextInt();
            }
            if (A[0] + A[1] <= A[n-1]){
                String ss = "" + n;
                System.out.println("1" + " " + "2" + " " + ss);
            }else{
                System.out.println("-1");
            }
        }
    }
}