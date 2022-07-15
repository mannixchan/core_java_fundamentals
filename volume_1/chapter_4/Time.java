package chapter_4;

import java.time.LocalDate;

public class Time {
    public static void main(String[] args)
    {
        LocalDate a = LocalDate.now();
        System.out.println(a.getYear());
        System.out.println(a.getMonthValue());
    }
}
