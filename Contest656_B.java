import java.util.*;
import java.io.*;

public class Contest656_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tt = 0; tt < t; tt++){
            int n = sc.nextInt();
            int arr[] = new int[2*n];
            for (int j = 0; j < 2*n; j++){
                arr[j] = sc.nextInt();
            }
            List<Integer> list = new ArrayList<>();
            for (int i: arr){
                if (!(list.contains(i))){
                    list.add(i);
                }
            }
            for (Integer i: list){
                System.out.print((int) i + " ");
            }
            System.out.println();
        }
    }
}
