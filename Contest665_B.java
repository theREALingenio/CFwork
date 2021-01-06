import java.io.*;
import java.util.*;

public class Contest665_B {
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long x1 = sc.nextLong(), y1 = sc.nextLong(), z1 = sc.nextLong();
            long x2 = sc.nextLong(), y2 = sc.nextLong(), z2 = sc.nextLong();
            long min = Math.min(z1,y2);
            y2 -= min;
            long remove = Math.max(0,y1-x2-y2);
            System.out.println(2*(min-remove));
        }
    }
}