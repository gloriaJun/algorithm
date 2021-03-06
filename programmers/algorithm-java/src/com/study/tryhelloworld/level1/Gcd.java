package src.com.study.tryhelloworld.level1;

import java.util.Arrays;

/**
 * TODO - 코드에 버그가 있음. 확인해서 수정이 필요함.
 */

/**
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환해주는 gcdlcm 함수를 완성해 보세요.
 * 배열의 맨 앞에 최대공약수, 그 다음 최소공배수를 넣어 반환하면 됩니다.
 * 예를 들어 gcdlcm(3,12) 가 입력되면, [3, 12]를 반환해주면 됩니다.
 *
 * 최대 공약수
 *  : 두 수를 나누어서 0이 되는 숫자 중 가장 큰 수
 *  : (a*b) / 최소 공배수
 * 최소 공배수
 *  : 두 수의 배수를 구하여 공통된 배수 중 가장 작은 숫자
 *  : (a*b) / 최대 공약수
 *
 * */
public class Gcd {

    public long gcd (long a, long b) {
        if (a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }

        while(true) {
            long tmp = a % b;
            if (tmp == 0)
                break;
            b = tmp;
        }

        return b;

    }

    public long[] gcdlcm(long a, long b) {
        long[] answer = new long[2];
        answer[0] = gcd(a, b);
        answer[1] = (a*b) / answer[0];

        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Gcd c = new Gcd();
//        System.out.println(Arrays.toString(c.gcdlcm(3095983144L, 144L)));
//        System.out.println(c.gcd(60, 48));
        System.out.println(Arrays.toString(c.gcdlcm(2, 6)));
        System.out.println(Arrays.toString(c.gcdlcm(978, 1212)));
        System.out.println(Arrays.toString(c.gcdlcm(26, 398)));
        System.out.println(5174/26);
        System.out.println(5174/398);
        System.out.println(Arrays.toString(c.gcdlcm(148, 176)));
        System.out.println(3256/148.);
        System.out.println(3256/176.);
//        System.out.println(Arrays.toString(c.gcdlcm(2, 5)));
    }
}
