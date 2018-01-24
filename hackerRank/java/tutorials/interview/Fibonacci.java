package interview;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem
 */
public class Fibonacci {
    public static int fibonacci(int n) {
        int num = 0;

        if (n < 2) {
            num = n;
        } else {
            int f0 = 0;
            int f1 = 1;
            for (int i = 1; i < n; i++) {
                num = f0 + f1;
                f0 = f1;
                f1 = num;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
