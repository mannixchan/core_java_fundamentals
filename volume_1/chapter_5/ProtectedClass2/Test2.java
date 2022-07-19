package chapter_5.ProtectedClass2;

import chapter_5.ProtectedClass1.ProtectedClass1;

public class Test2 extends ProtectedClass1 {
    // 但是即使在不同包下面, 只要一个类继承了拥有 保护字段 或者 保护方法, 那么他依然可以使用这些保护字段或方法
    public static void main(String[] args) {
        Test2 a= new Test2();
        System.out.println(a.name);
        a.printSth();
    }
}
