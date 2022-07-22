package chapter_5.ProtectedClass2;

import java.util.Objects;

public class Test3 {
    public static void main(String[] args) {
        var a = 88d;
        var b = "888";
        System.out.println(Objects.hash(a, b));

    }
}
