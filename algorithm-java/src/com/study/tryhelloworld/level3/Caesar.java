package src.com.study.tryhelloworld.level3;

/**
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.

 A를 3만큼 밀면 D가 되고 z를 1만큼 밀면 a가 됩니다. 공백은 수정하지 않습니다.

 보낼 문자열 s와 얼마나 밀지 알려주는 n을 입력받아 암호문을 만드는 ceasar 함수를 완성해 보세요.

 “a B z”,4를 입력받았다면 “e F d”를 리턴합니다.
 */
public class Caesar {
  String caesar(String s, int n) {
    String result = "";

    for(char c : s.toCharArray()) {
      int ascii = (int)c;
      if ( Character.isUpperCase(c) ) {
        ascii = (ascii - (int)'A' + n) % 26 + (int)'A';
      } else if (Character.isLowerCase(c)) {
        ascii = (ascii - (int)'a' + n) % 26 + (int)'a';
      }
      result += String.valueOf((char)ascii);
    }
    return result;
  }

  public static void main(String[] args) {
    Caesar c = new Caesar();
    System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
  }
}
