package chapter_3;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Date;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
//        System.out.println("What's your name?");
//        String name = in.nextLine();
//        System.out.println("How old are you?");
//        int age = in.nextInt();
//        String age = in.next();
//        System.out.println("Hello, " + name + ", Next year, you will be " + (age + 1));

//         System console 的用法
//        Console cons = System.console();
//        String username = cons.readLine("User name: " );
//        char[] passwd = cons.readPassword("Password: ");


//        System.out.printf("%tc", new Date());

//        Scanner in = new Scanner(Path.of("demo.txt"), StandardCharsets.UTF_8);
//        System.out.println(in.nextLine());
//        String str = System.getProperty("user.dir");
//        System.out.println(str);
        PrintWriter out = new PrintWriter("good.txt", StandardCharsets.UTF_8);
        out.write("88888899999");
//        out.println("8888");
//        out.print("99999");
    }
}
