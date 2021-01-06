import java.io.*;
import java.util.*;

public class Contest665_A {
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (n <= k){
                System.out.println(k-n);
            }else{
                if ((n-k) % 2 == 0){
                    System.out.println(0);
                }else{
                    System.out.println(1);
                }
            }
        }
    }
}