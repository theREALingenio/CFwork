import java.util.*;
import java.io.*;

public class Contest656_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            solve(a,b,c);
        }
    }
    public static void solve(int a, int b, int c){
        if (a != b && b != c && c != a){
            System.out.println("NO");
            return;
        }
        if (a == b && b == c){
            System.out.println("YES");
            System.out.println(a + " " + b + " " + c);
            return;
        }
        int x = 0, y = 0, z = 0;
        if (a == b){
            if (c < b){
                x = a;
                y = c;
                z = 1;
                System.out.println("YES");
                System.out.println(x + " " + y + " " + z);
                return;
            }
        }
        if (a == c){
            if (b < c){
                y = a;
                z = b;
                x = 1;
                System.out.println("YES");
                System.out.println(x + " " + y + " " + z);
                return;
            }
        }
        if (b == c){
            if (a < b){
                z = c;
                x = a;
                y = 1;
                System.out.println("YES");
                System.out.println(x + " " + y + " " + z);
                return;
            }
        }
        System.out.println("NO");
    }
}
