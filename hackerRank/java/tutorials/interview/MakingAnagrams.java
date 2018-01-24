package interview;

/*
https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
- Anagram 문제
서로 다른 두 문자열이 있을때 두 문자열의 알파벳을 재배열하였을때 같은 단어 혹은 문장.
예를 들어,
along 과 laong 은 Anagram 입니다.
table 과 abtel 은 Anagram 입니다.
bacdc 과 dcbad 은 Anagram이 아닙니다.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        int cnt = 0;
        char[] firstArr = first.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] secondArr = second.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        // 첫번째 문자열의 각 단어의 갯수를 구한다
        HashMap<String, Integer> map = new HashMap<>();
        for (char c : firstArr) {
            map.merge(String.valueOf(c), 1, Integer::sum);
        }

        HashMap<String, Integer> map2 = new HashMap<>();
        for (char c : secondArr) {
            map2.merge(String.valueOf(c), 1, Integer::sum);
        }
        System.out.println(map);
        System.out.println(map2);
        for (char c : secondArr) {
            String s = String.valueOf(c);
           if (first.contains(s) && map.containsKey(s)) {
               map.put(s, map.get(s) - 1 );
           } else {
               map.merge(s, 1, Integer::sum);
           }
        }

        System.out.println(map);
        for (String key : map.keySet()) {
           cnt += Math.abs(map.get(key));
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
