package chapter_5.abstractClasses;

import java.time.LocalDate;

public class Employee extends People{
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, int year, int month, int dayOfMonth ){
        super(name);
        this.salary = salary;
        LocalDate localDate = LocalDate.of(year, month, dayOfMonth);
        hireDate = localDate;
    }

    public String getDescription() {
        return String.format("一个有 $%.2f 薪水的员工", salary);
    }
}
