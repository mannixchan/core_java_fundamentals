package chapter_3;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("取几个数字?");
        int k = in.nextInt();
        System.out.println("一共多少数字?");
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }
        int[] newResult = new int[k];
        for (int i = 0; i < k; i++) {
            int r = (int) (n * Math.random());
            newResult[i] = numbers[r];
            numbers[r] = numbers[n-1];
            n--;
        }
        Arrays.sort(newResult);
        System.out.println(Arrays.toString(newResult));
    }
}
