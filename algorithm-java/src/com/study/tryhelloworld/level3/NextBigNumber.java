package src.com.study.tryhelloworld.level3;

/**
 * 어떤 수 N(1≤N≤1,000,000) 이 주어졌을 때, N의 다음 큰 숫자는 다음과 같습니다.

 N의 다음 큰 숫자는 N을 2진수로 바꾸었을 때의 1의 개수와 같은 개수로 이루어진 수입니다.
 - 1번째 조건을 만족하는 숫자들 중 N보다 큰 수 중에서 가장 작은 숫자를 찾아야 합니다.
 - 예를 들어, 78을 2진수로 바꾸면 1001110 이며, 78의 다음 큰 숫자는 83으로 2진수는 1010011 입니다.
 N이 주어질 때, N의 다음 큰 숫자를 찾는 nextBigNumber 함수를 완성하세요.
 */
public class NextBigNumber {
    // 내가 푼 방식
//    public int nextBigNumber(int n) {
//        int answer = 0;
//        int cnt = getCount(n);
//
//        for (int i = n + 1; i <= 1000000; i++) {
//            if (cnt == getCount(i)) {
//                answer = i;
//                break;
//            }
//        }
//
//        return answer;
//    }
//
//    public int getCount(int n) {
//        String bin = Integer.toBinaryString(n);
//        int cnt = 0;
//        for (char c : bin.toCharArray()) {
//            if ( c == '1') {
//                cnt++;
//            }
//        }
//        return cnt;
//    }

    // case 2
    public int nextBigNumber(int n)
    {
        int a = Integer.bitCount(n);
        int compare = n+1;

        while(true) {
            if(Integer.bitCount(compare)==a)
                break;
            compare++;
        }

        return compare;
    }

    // 2진수의 비트 연산 이용하는 방식인데 다 까먹어서 도통 원리가 이해가 안간다.ㅠㅠ
//    public int nextBigNumber(int n) {
//        int postPattern = n & -n, smallPattern = ((n ^ (n + postPattern)) / postPattern) >> 2;
//        return n + postPattern | smallPattern;
//    }

    public static void main(String[] args)
    {
        NextBigNumber test = new NextBigNumber();
        int n = 78;
        System.out.println(test.nextBigNumber(n));
    }
}
