package chapter_3;

import java.util.Arrays;

public class CreateArray {
    public static void main(String[] args) {
        int[] a;
        // 或者, 但是通常用上面这种
        int b[];
        int[] c = new int[100];
        int[] d = {1, 2,3,4};
        int[] e = new int[] {1,2,3,4};
/*        for(int i = 0; i < 100; i++) System.out.println(c[i]);
        for(int i = 0; i < c.length; i++) System.out.println(ci]);*/
        System.out.println(Arrays.toString(c));
    }
}
