package interview;

import java.util.*;

public class IceCreamParlor {
    static void solve(int[] arr, int money) {
        for (int i = 1, j = i; i <= arr.length; i++) {
            if ((arr[i - 1] + arr[j - 1]) == money) {
                System.out.println(i + " " + j);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int money = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int arr_i = 0; arr_i < n; arr_i++) {
                arr[arr_i] = in.nextInt();
            }
            solve(arr, money);
        }
        in.close();
    }
}
