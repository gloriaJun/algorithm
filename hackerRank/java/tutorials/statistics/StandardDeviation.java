package statistics;


import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/s10-standard-deviation/problem
 */
public class StandardDeviation {
    private static int[] inputArrayScan(Scanner scanner, int size) {
        int[] arr = new int[size];
        for (int i=0; i < size; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        return arr;
    }

    private static double mean(int[] arr, int size)  {
        double mean = 0;
        for (int n : arr) {
            mean += n;
        }
        return mean / size;
    }

    private static double standardDeviation(int[] arr, int size, double mean) {
        double dist = 0;
        for (int n : arr) {
            dist += Math.pow(n - mean, 2);
        }
        return dist / size;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = inputArrayScan(scanner, size);
        scanner.close();

        double mean = mean(arr, size);
        double dev = standardDeviation(arr, size, mean);

        // result
        double result = Math.sqrt(dev);
        System.out.println(Math.round(result*10d) / 10d);
    }
}
