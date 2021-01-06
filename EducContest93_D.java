import java.io.*;
import java.util.*;

public class EducContest93_D {
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(); int G = sc.nextInt(); int B = sc.nextInt();
        int r[] = new int[R];
        int g[] = new int[G];
        int b[] = new int[B];
        for (int i = 0; i < R; i++){
            r[i] = sc.nextInt();
        }
        Arrays.sort(r);
        for (int i = 0; i < G; i++){
            g[i] = sc.nextInt();
        }
        Arrays.sort(g);
        for (int i = 0; i < B; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        long dp[][][] = new long[R+1][G+1][B+1];
        for (int i = 0; i <= R; i++){
            for (int j = 0; j <= G; j++){
                for (int k = 0; k <= B; k++){
                    if (i >= 1 && j >= 1){
                        dp[i][j][k] = Math.max(dp[i][j][k],dp[i-1][j-1][k] + r[i-1]*g[j-1]);
                    }
                    if (i >= 1 && k >= 1){
                        dp[i][j][k] = Math.max(dp[i][j][k],dp[i-1][j][k-1]+r[i-1]*b[k-1]);
                    }
                    if (j >= 1 && k >= 1){
                        dp[i][j][k] = Math.max(dp[i][j][k],dp[i][j-1][k-1] + g[j-1]*b[k-1]);
                    }
                }
            }
        }
        System.out.println(dp[R][G][B]);
    }
}