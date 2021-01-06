import java.io.*;
import java.util.*;

public class EducContest94_B {
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = sc.nextInt();
        while (T-- > 0){
            int p = sc.nextInt(), f = sc.nextInt();
            int cs = sc.nextInt(),cw = sc.nextInt();
            int s = sc.nextInt(), w = sc.nextInt();
            if (s > w){
                int temp = s;
                s = w;
                w = temp;

                temp = cs;
                cs = cw;
                cw = temp;
            }
            long ans = 0;
            for (int i = 0; i <= cs; i++){
                if (i * (long) s > p){
                    continue;
                }
                int t1 = Math.min(cs-i,f/s);
                int t2 = Math.min((p-i*s)/w,cw);
                int t3 = Math.min((f-t1*s)/w,cw-t2);
                ans = Math.max(ans,i+t1+t2+t3);
            }
            out.println(ans);
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