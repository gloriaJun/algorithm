/*
https://www.hackerrank.com/challenges/s10-basic-statistics/problem
 */
package statistics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DayZero {
    private static double mean(int size, int[] arr) {
        double m = 0;
        for (int n : arr) {
            m += n;
        }
        return m / size;
    }

    private static double median(int size, int[] arr) {
        int idx = size / 2;
        double sum = arr[idx];

        if ( size % 2 == 0 ) {
            sum = (sum + arr[idx -1]) / 2;
        }
        return sum;
    }

    private static int mode(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int mode = Integer.MAX_VALUE;
        int max = 1;
        for (int n : arr) {
            // 키 값이 중복이 되면 기존 값과 합쳐라.
            map.merge(n, 1, Integer::sum);
            int temp = map.get(n);
            if (temp > max || (temp == max&& n < mode)) {
                max = temp ;
                mode = n;
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i=0; i < size; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        scanner.close();

        // sort array
        Arrays.sort(arr);

        // result
        System.out.println("mean : " + mean(size, arr));
        System.out.println("median : " + median(size, arr));
        System.out.println("mode: " + mode(arr));
    }
}
