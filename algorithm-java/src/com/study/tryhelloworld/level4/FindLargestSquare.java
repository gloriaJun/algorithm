package src.com.study.tryhelloworld.level4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * O와 X로 채워진 표가 있습니다. 표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다.
 * 표에서 O로 이루어진 가장 큰 정사각형을 찾아 넓이를 반환하는 findLargestSquare 함수를 완성하세요.
 */
public class FindLargestSquare {
  final char chk = 'O';

  public int checkSquare(char [][]board, int x, int y) {
    String str = new String(board[y]).substring(x);
    int cnt = board.length;

    for (int i = y; i < str.indexOf('X'); i++) {
      for (int j = x; j < cnt ; j++) {
        if (board[i][j] != chk)  {
          return 0;
        }
      }
    }
    return (int)Math.pow(cnt - x - str.indexOf('X'), 2);
  }

  public int findLargestSquare(char [][]board)
  {
      int answer = 0;
      int cnt = board.length;

      for (int y = 0; y < cnt; y++) {
          for (int x = 0; x < cnt; x++) {
            if (Math.pow(cnt - y, 2) <= answer) {
              return  answer;
            } else if (board[y][x] == chk) {
              int size = checkSquare(board, x, y);
              answer = (answer < size)? size : answer;
              if (answer > 0) {
                break;
              }
            }
          }
      }

      return answer;
  }

  public static void main(String[] args)
  {
      FindLargestSquare test = new FindLargestSquare();
      char [][]board ={
              {'X', 'X','O','O','O','O','O','O','X'},
              {'X', 'X','O','O','O','O','O','O','O'},
              {'X', 'X','O','O','O','O','O','O','O'},
              {'X', 'X','O','O','O','O','O','O','O'},
              {'X', 'X','O','O','O','O','O','O','O'},
              {'X', 'X','O','O','O','O','O','O','O'},
              {'X', 'X','O','O','O','O','O','O','O'}
      };

      System.out.println(test.findLargestSquare(board));
  }
}
