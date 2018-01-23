/*
https://www.hackerrank.com/challenges/s10-weighted-mean/problem
 */
package hackerrank.statistics;

import java.util.Scanner;

public class DayZeroWeightedMean {
    private static int[] inputArrayScan(Scanner scanner, int size) {
        int[] arr = new int[size];
        for (int i=0; i < size; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arrX = inputArrayScan(scanner, size);
        int[] arrW = inputArrayScan(scanner, size);

        scanner.close();

        double sumW = 0;
        double sumX = 0;
        for (int i = 0; i < arrX.length; i++) {
            sumW += arrW[i];
            sumX += arrX[i] * arrW[i];
        }

        System.out.printf("%.1f", (sumX / sumW));
    }
}
