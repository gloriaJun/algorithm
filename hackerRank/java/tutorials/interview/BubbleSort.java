package interview;

import java.util.Arrays;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/ctci-bubble-sort/problem
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i=0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        System.out.println(Arrays.toString(arr));
        int swapCnt = 0;
        for (int i=0; i<size; i++) {
            for (int j=0; j<size-1; j++) {
                if(arr[j] > arr[j+1]) {
                   swapCnt++;
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Array is sorted in " + swapCnt + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[size - 1]);
    }
}
