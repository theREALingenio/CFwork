import java.io.*;
import java.util.*;

public class Contest661_A {
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tt = 0; tt < t; tt++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            boolean b = true;
            for (int i = 0; i < n-1; i++){
                if (arr[i+1]-arr[i] > 1){
                    b = false;
                    break;
                }
            }
            if (b) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}