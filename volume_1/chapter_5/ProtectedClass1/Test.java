package chapter_5.ProtectedClass1;

public class Test {
    public static void main(String[] args) {
        // 同一个包下面, 可以访问保护方法
        ProtectedClass1 a = new ProtectedClass1();
        a.printSth();
        System.out.println(a.name);
    }
}
