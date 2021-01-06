import java.io.*;
import java.util.*;

public class Contest689_A {
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            String res = "";
            for (int i = 0; i < k; i++){
                res += "c";
            }
            int j = 0;
            while (res.length() < n){
                if (j == 0){
                    res += "a";
                }
                if (j == 1){
                    res += "b";
                }
                if (j == 2){
                    res += "c";
                }
                j = (j+1) % 3;
            }
            out.println(res);
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