package src.com.study.tryhelloworld.level2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 2016년 1월 1일은 금요일입니다. 2016년 A월 B일은 무슨 요일일까요?
 * 두 수 A,B를 입력받아 A월 B일이 무슨 요일인지 출력하는 getDayName 함수를 완성하세요.
 * 요일의 이름은 일요일부터 토요일까지 각각

 SUN,MON,TUE,WED,THU,FRI,SAT

 를 출력해주면 됩니다. 예를 들어 A=5, B=24가 입력된다면
 5월 24일은 화요일이므로 TUE를 반환하면 됩니다.
 */
public class getDayName {
    public String getDayName(int a, int b)
    {
        String[] weekArr = new String[] {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        LocalDate startDate = LocalDate.of(2016, 1, 1);
        LocalDate date = LocalDate.of(2016, a, b);

        long days = ChronoUnit.DAYS.between(startDate, date);
        long idx = (5 + days) % 7;
        return weekArr[(int)idx];
    }
    public static void main(String[] args)
    {
        getDayName test = new getDayName();
        int a=5, b=24;
        System.out.println(test.getDayName(a,b));
    }
}
