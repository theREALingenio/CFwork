import java.io.*;
import java.util.*;

public class EducContest94_C {
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            int x = sc.nextInt();
            StringBuilder w = new StringBuilder();
            for (int i = 0; i < s.length(); i++){
                w.append('1');
            }
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) == '0'){
                    if (i-x >= 0){
                        w.setCharAt(i-x,'0');
                    }
                    if (i + x < s.length()){
                        w.setCharAt(i+x,'0');
                    }
                }
            }
            //now we'll run thru w again and see what it says
            StringBuilder s1 = new StringBuilder();
            for (int i = 0; i < w.length(); i++){
                if (i >= x && w.charAt(i-x)== '1'){
                    s1.append('1');
                }
                else if(i + x < w.length() && w.charAt(i+x) == '1'){
                    s1.append('1');
                }
                else{
                    s1.append('0');
                }
            }
            String c1 = w.toString();
            String c2 = s1.toString();
            //out.println(c1 + " " + c2);
            if (!s.equals(c2)){
                out.println(-1);
            }else{
                out.println(c1);
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