package chapter_5.abstractClasses;

public class AbstractTest {
    public static void main(String[] args) {
        People[] list = new People[2];
        list[0] = new Student("mingming", "computer science");
        list[1] = new Employee("qiqi", 8000, 1998, 7, 21);
        for(People e: list) {
            System.out.println(e.getName() + e.getDescription());
        }
    }
}
