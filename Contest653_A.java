import java.util.*;
public class Contest653_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();
            int ans = n / x;
            ans = ans*x+y;
            if (ans > n) ans-=x;
            System.out.println(ans);
        }
    }
}
