package chapter_5.ProtectedClass2;

import chapter_5.ProtectedClass1.ProtectedClass1;

public class Test {
    public static void main(String[] args) {
        // 无法在其他包下面使用受保护的方法
        ProtectedClass1 a = new ProtectedClass1();
//        System.out.println(a.name);
//        a.printSth();
    }
}
