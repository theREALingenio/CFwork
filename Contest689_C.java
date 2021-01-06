import java.io.*;
import java.util.*;

public class Contest689_C {
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt(), m = sc.nextInt();
            int A[] = new int[n+1];
            int R[] = new int[m];
            double P[] = new double[m];
            for (int i = 1; i <= n; i++){
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++){
                R[i] = sc.nextInt();
                P[i] = sc.nextDouble();
            }
            int bad_index = -1;
            for (int i = n; i > 0; i--){
                if (A[i] != i){
                    bad_index = i;
                    break;
                }
            }
            double complement = 1;
            for (int i = 0; i < m; i++){
                if (R[i] >= bad_index){
                    complement *= (1-P[i]);
                }
            }
            if (bad_index == -1){
                out.println(1);
            }else{
                out.println(1-complement);
            }
        }
        out.close();
    }

    //-----------MyScanner class for faster input copped from bobib----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }
}