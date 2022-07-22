package chapter_5.arrlist;

import java.util.ArrayList;

public class ArrListTest {
    public static void main(String[] args) {
        // 可以使用没有<> 的 arrayList, 可以理解为删除了类型参数的原始类型
        ArrayList a = new ArrayList();
        System.out.println(a.toString());
    }
}
