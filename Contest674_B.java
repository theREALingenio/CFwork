import java.io.*;
import java.util.*;

public class Contest674_B {
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt(), m = sc.nextInt();
            boolean ans = false;
            for (int i = 0; i < n; i++){
                int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
                if (b == c) ans = true;
            }
            if (m % 2 != 0){
                System.out.println("NO");
            }
            else System.out.println(ans==true ? "YES" : "NO");

        }
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