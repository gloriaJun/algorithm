package src.com.study.tryhelloworld.level4;

/**
 * O와 X로 채워진 표가 있습니다. 표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다.
 * 표에서 O로 이루어진 가장 큰 정사각형을 찾아 넓이를 반환하는 findLargestSquare 함수를 완성하세요.
 */
public class FindLargestSquare {

  public int findLargestSquare(char [][]board)
  {
      int answer = 0;
      final char chk = 'O';

      int rowCnt = board.length;
      int colCnt = board[0].length;

      for (int i = 0; i < rowCnt; i++) {
          for (int j = 0; j < colCnt; j++) {
              if (board[i][j] == chk) {


                for (int x = i; x < rowCnt; x++) {
                  for (int y = 0; y < colCnt; y++) {
                  }
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
              {'X','O','O','O','X'},
              {'X','O','O','O','O'},
              {'X','X','O','O','O'},
              {'X','X','O','O','O'},
              {'X','X','X','X','X'}};

      System.out.println(test.findLargestSquare(board));
  }
}
