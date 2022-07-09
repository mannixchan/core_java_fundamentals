package chapter_3;

import java.util.Scanner;

public class LotteryOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("总共选几个数字?");
        int a = in.nextInt();
        System.out.println("在多少个数字里选");
        int b = in.nextInt();
        int lotteryOdds = 1;
        for(int i = 1; i <= a; i++)
            lotteryOdds = lotteryOdds*(b-i+1)/i;
        System.out.println("你的概率是 1 in " + lotteryOdds);

    }
}
