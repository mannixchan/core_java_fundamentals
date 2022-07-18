package chapter_5.inheritance;

public class ManageTest {
    public static void main(String[] args) {
        Employee[] list = new Employee[3];
        Manager tom = new Manager("tom", 4000, 1992, 10, 21, 4000);
        Employee jack = new Employee("jack", 4000, 1992, 10, 01 );
        Employee rose = new Employee("rose", 4000, 1993, 7, 7);
        list[0] = tom;
        list[1] = jack;
        list[2] = rose;
        for (Employee e: list) {
            System.out.println(e.getName() + "的薪水是: " + e.getSalary());
        }
    }
}
