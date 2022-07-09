package chapter_3;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("一次选多少个数字?");
        int drawNums = in.nextInt();
        System.out.println("在多少个数字里面选?");
        int totalAmount = in.nextInt();
        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for(int i = 1; i <= drawNums; i++)
        {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(totalAmount - i + 1) ).divide(BigInteger.valueOf(i));
        }

        // BigInteger 可以直接和字符串进行拼接
        System.out.println("your odds is 1 in " + lotteryOdds);


    }
}
