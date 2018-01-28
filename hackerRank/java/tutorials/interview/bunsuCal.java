package interview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

/**
 *  분모가 다른 분수의 덧셈
 */
public class bunsuCal {

    static public long gcd (long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }


    static public long lcm(long a, long b) {
        long lcm = a*b;
        long gcd = gcd(a, b);

        return ((lcm % gcd) == 0)? lcm/gcd : lcm;
    }

    static String[] reducedFractionSums(String[] expressions) {
        String[] result = new String[expressions.length];
        for (int i=0; i<expressions.length; i++) {
            String[] temp = expressions[i].split("[/+]");

            long[] ab = new long[]{Integer.parseInt(temp[0]), Integer.parseInt(temp[1])};
            long[] cd = new long[]{Integer.parseInt(temp[2]), Integer.parseInt(temp[3])};

            // 통분하기
            long f = lcm(ab[1], cd[1]); // 최소공배수로 통분하기
            long e = ab[0] * (f / ab[1]) + cd[0] * (f / cd[1]);
            //System.out.println(e + "/" + f);

            // 최대공약수를 이용하여 약분하기
            long gcd = gcd(e,f);
            result[i] = e/gcd + "/" + f/gcd;
            //System.out.println(result[i]);
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String[] res;
        int expressions_size = 0;
        expressions_size = Integer.parseInt(in.nextLine().trim());

        String[] expressions = new String[expressions_size];
        for(int i = 0; i < expressions_size; i++) {
            String expressions_item;
            try {
                expressions_item = in.nextLine();
            } catch (Exception e) {
                expressions_item = null;
            }
            expressions[i] = expressions_item;
        }

        res = reducedFractionSums(expressions);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();;
    }
}
