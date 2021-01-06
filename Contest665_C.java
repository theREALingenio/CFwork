import java.io.*;
import java.util.*;

public class Contest665_C {
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int A[] = new int[n];
            int B[] = new int[n];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++){
                int read = sc.nextInt();
                A[i] = read; B[i] = read;
                min = Math.min(min,read);
            }
            //sort B
            Arrays.sort(B);
            boolean ans = true;
            for (int i = 0; i < n; i++){
                if (A[i] % min != 0 && A[i] != B[i]){
                    ans = false;
                    break;
                }
            }
            if (ans){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}