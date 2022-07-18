package chapter_5.inheritance;

public class Demo {
    public double get(double num) {
        System.out.println(num);
        return num;
    }
    public int get(int num) {
        System.out.println(num);
        return num;
    }
    public static void main(String [] a) {
        var b = new Demo();
        b.get(2d);
//        Manager[] managers = new Manager[10];
//        Employee[] employees = managers;
//        // 当直接把 这里 Emp 对象扫到 employees 中时, 会报 ArrayStoreException 异常
//        // 主要问题是, 编译不报错, 但是运行时会报错
//        employees[0] = new Employee();
    }
}
