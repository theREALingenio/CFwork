import java.util.*;
public class Contest653_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }
    public static int solve(int n){
        int count = 0;
        while (n != 1){
            if (n%6 == 0){
                n/=6;
                count++;
            }
            else if (n%6 == 3){
                n*=2;
                count++;
            }
            else{
                return -1;
            }
        }
        return count;
    }
}
