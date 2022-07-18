package chapter_5.inheritance;

import java.time.LocalDate;

public class Employee {
    private double salary;
    private LocalDate hireDate;
    private String name;
    public static void main(String[] args) {
        Employee mingming = new Employee("mingming", 8999, 1992, 10, 05);
        System.out.println(mingming.getName());
    }
    // 如果构造函数不是 public 权限, 那么在其他包下面将无法创建其实例
     public Employee (String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDate = LocalDate.of(year, month, day);
    }
    public Employee() {

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
