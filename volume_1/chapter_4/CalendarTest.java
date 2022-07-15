package chapter_4;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

public class CalendarTest
{
    public static void main(String[] args)
    {
        LocalDate todayDate = LocalDate.now();
        int month = todayDate.getMonthValue();
        int today = todayDate.getDayOfMonth();
        LocalDate date = todayDate.minusDays(today - 1);
        DayOfWeek weekDay = date.getDayOfWeek();
        int value = weekDay.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1; i < value; i++)
        {
            System.out.print("    ");
        }
        while(date.getMonthValue() == month)
        {
            // 3 代表包含前置空格, 一共三个字符, d代表用后面的数字参数进行替换
            System.out.printf("%3d", date.getDayOfMonth());
            if(date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        // 如果下个月的第一天是一周的第一天, 就得新启动一行, 因为这个月结束了, 后面不再加日期了
        if(date.getDayOfWeek().getValue() != 1) System.out.println();

    }
}
