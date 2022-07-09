package chapter_3;

import java.util.Scanner;

public class Retirement {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("你退休要多少钱");
        double goal = in.nextDouble();
        System.out.println("你每年存多少");
        double payment  = in.nextDouble();
        System.out.println("利率多少");
        double interestRate = in.nextDouble();
        double blance = 0;
        int years = 0;
        while (blance < goal)
        {
            blance += payment;
            double interest = blance * interestRate / 100;
            blance += interest;
            years++;
        }
        System.out.println("You can retire in " + years + " years");
    }
}
