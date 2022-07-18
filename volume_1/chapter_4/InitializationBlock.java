package chapter_4;

public class InitializationBlock {
    static {
        System.out.println(88888);
    }
    public InitializationBlock() {
        // 构造其中的代码将在最后执行
        System.out.println(3);
    }
    {
        System.out.println(1);
    }
    private int a;
    {
        System.out.println(a);
        a = this.getInt();
        System.out.println(a);
         int b = a;
    }

    public static void main(String[] args) {
        new SubEmployee();
        new InitializationBlock();
    }
    public int getInt() {
        return 222222;
    }
}
