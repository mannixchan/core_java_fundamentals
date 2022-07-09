package chapter_3;

public class BreakTest {
    public static void main(String[] args) {
label:
{
    System.out.println(1);
    if(false)
    break label;
    System.out.println(2);
}
    }
}
