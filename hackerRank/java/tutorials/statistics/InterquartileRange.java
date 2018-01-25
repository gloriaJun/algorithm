package statistics;

import java.util.*;

/*
https://www.hackerrank.com/challenges/s10-interquartile-range/problem
 */
public class InterquartileRange {
    private static int[] inputArrayScan(Scanner scanner, int size) {
        int[] arr = new int[size];
        for (int i=0; i < size; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        return arr;
    }

    private static double findQuartiles(List<Integer> list, int start, int end) {
        int size = start + end + 1;
        int idx = size / 2;
        return (size % 2 == 0)? (list.get(idx-1) + list.get(idx)) / 2. : list.get(idx);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] elArr = inputArrayScan(scanner, size);
        int[] freqArr = inputArrayScan(scanner, size);
        scanner.close();

        // create data set
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<size; i++) {
            for (int j=0; j<freqArr[i]; j++) {
                list.add(elArr[i]);
            }
        }
        Collections.sort(list);

        size = list.size();
        int mSize = list.size() / 2;
        double q1 = findQuartiles(list, 0, mSize - 1);
        double q3 = findQuartiles(list, (size % 2 == 0)? mSize : mSize+1, size-1);
//        System.out.println(list);
//        System.out.println(q1);
//        System.out.println(q3);
        System.out.println(q3 - q1);
    }
}
