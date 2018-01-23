package src.com.study.tryhelloworld.level1;

/**
 * getMiddle메소드는 하나의 단어를 입력 받습니다. 단어를 입력 받아서
 * 가운데 글자를 반환하도록 getMiddle메소드를 만들어 보세요.
 * 단어의 길이가 짝수일경우 가운데 두글자를 반환하면 됩니다.
 예를들어 입력받은 단어가 power이라면 w를 반환하면 되고, 입력받은 단어가 test라면 es를 반환하면 됩니다.
 */
public class StringExercise {
    String getMiddle(String word){
        String str = new String();
        Integer len = word.length();
        Integer mid = len/2;

        if (len % 2 == 0) {
            str = word.substring(mid - 1, mid + 1);
        } else {
            str = word.substring(mid, mid + 1);
        }

        return str;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}
