package statistics;

import java.util.Arrays;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/s10-quartiles/problem
 */
public class Quartiles {
    private static int[] inputArrayScan(Scanner scanner, int size) {
        int[] arr = new int[size];
        for (int i=0; i < size; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        return arr;
    }

    private static int findQuartiles(int[] arr, int start, int end) {
        int size = start + end + 1;
        int idx = size / 2;
        return (size % 2 == 0)? (arr[idx-1] + arr[idx]) / 2 : arr[idx];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr= inputArrayScan(scanner, size);
        scanner.close();

        // sort
        Arrays.sort(arr);
        // get middle size
        int mSize = size / 2;

//        System.out.println(Arrays.toString(arr));
        System.out.println(findQuartiles(arr, 0, mSize - 1));
        System.out.println(findQuartiles(arr, 0, size - 1));
        if (size % 2 == 0) {
            System.out.println(findQuartiles(arr, mSize, size - 1));
        } else {
            System.out.println(findQuartiles(arr, mSize + 1, size - 1));
        }
    }
}
