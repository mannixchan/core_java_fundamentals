package chapter_5.equalsTest;

public class EqualsTest {
    public static void main(String[] args) {
        var alice1 = new Employee("Alice", 750000, 1987, 12, 15);
        var alice2 = alice1;
        var alice3 = new Employee("Alice", 750000, 1987, 12, 15);
        var bob = new Employee("Bob", 50000, 1989, 10, 1);
        System.out.println(alice1 == alice2);
        System.out.println(alice1 == alice3);
        System.out.println(alice1.equals(alice2));
        System.out.println(alice1.equals(alice3));
        System.out.println(alice1.equals(bob));
        System.out.println("" + bob);
        var carl = new Manager("carl", 8000, 1919, 10, 1, 0);
        var boss = new Manager("carl", 8000, 1919, 10, 1, 0);
        boss.setBonus(8000);
        System.out.println(boss.toString());
        System.out.println(carl.equals(boss));
        System.out.println(alice1.hashCode());
        System.out.println(alice3.hashCode());
        System.out.println(bob.hashCode());
        System.out.println(carl.hashCode());


    }
}
