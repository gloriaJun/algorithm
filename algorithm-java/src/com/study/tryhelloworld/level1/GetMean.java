package com.study.tryhelloworld.level1;

/**
 * 함수를 완성해서 매개변수 list의 평균값을 return하도록 만들어 보세요.
 어떠한 크기의 list가 와도 평균값을 구할 수 있어야 합니다.
 */
public class GetMean {
    public int getMean(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;
        for(int i : array) sum += i;
        return sum / array.length;
    }

    public static void main(String[] args) {
        int x[] = {};
        GetMean getMean = new GetMean();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("평균값 : " + getMean.getMean(x));
    }
}
