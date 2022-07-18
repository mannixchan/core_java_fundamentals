package chapter_4;

public class Employee {
    public Employee(double s){
//        System.out.println("1prameter");
        this("jojo", s);
    }
    public Employee(String a, double s) {
        System.out.println(a);

    }
}
class SubEmployee {
    SubEmployee(){
        System.out.println("sub....");
    }
}
