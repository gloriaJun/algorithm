package interview;

import java.util.HashMap;
import java.util.Scanner;

public class LonelyInteger {

    // 다른 사람이 해당 문제를 푼 방식
    public static int lonelyInteger(int[] a) {
        int value = 0;

        for (int i : a) {
            value ^= i; // 이게 잘은 이해가 안감..ㅠㅠ
            // value = value ^ i;
            // 같은 수가 두번 연산되면 0 ...을 이용한 비트 연산인데...어렵다..ㅠㅠ
//            System.out.println("a : " + i + ", val : " + value);
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : a) {
            map.merge(num, 1, Integer::sum);
        }
        System.out.println(map);
        for(int key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                System.out.println(key);
                break;
            }
        }

        System.out.println(lonelyInteger(a));
    }
}
