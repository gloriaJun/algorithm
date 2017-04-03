package src.com.study.tryhelloworld.level1;

/**
 *
 * str을 숫자로 변환한 결과를 반환하도록 strToInt를 완성하세요.
 예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
 str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
 */
public class StrToInt1 {
    public int getStrToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    //아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String args[]) {
        StrToInt1 strToInt = new StrToInt1();
        System.out.println(strToInt.getStrToInt("+10000"));
    }
}
