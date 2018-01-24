package interview;

import java.util.*;

/*
https://www.hackerrank.com/challenges/ctci-ransom-note/problem
 */
public class RansomNote {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (String str : magazine) {
            map.merge(str, 1, Integer::sum);
        }
        // 단어 체크
        boolean result = true;
        for (String str : ransom) {
            if (!map.containsKey(str) || map.get(str) == 0) {
                result = false;
                break;
            } else {
                map.put(str, map.get(str) - 1);
            }
        }
//        System.out.println(map);
        System.out.println(result? "Yes" : "No");
    }
}
