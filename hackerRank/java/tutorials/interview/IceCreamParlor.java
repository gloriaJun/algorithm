package interview;

import java.util.*;

public class IceCreamParlor {
    static void solve(int[] arr, int money) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i=0; i<arr.length; i++) {
//            if (money > arr[i]) {
//                map.put(i+1, arr[i]);
//            } else {
//                break;
//            }
//        }
//
//        int i=1;
//        for (int idx : map.keySet()) {
//            int j=i;
//            if (map.)
//        }


        for (int i=1,j=i; i<=arr.length; i++) {
//            for (int j=i+1; j<=arr.length-1; j++) {
                if ((arr[i-1] + arr[j-1]) == money) {
                    System.out.println(i + " " + j);
                    break;
                }
//            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int money = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            solve(arr, money);
        }
        in.close();
    }
}
