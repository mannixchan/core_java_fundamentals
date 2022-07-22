package chapter_5.equalsTest;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;
    public Employee(String name, double salary, int year, int month, int dayOfMonth) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, dayOfMonth);
    }
    @Override
    public boolean equals(Object otherObject) {
        // 1.判断是不是等于自己
        if(this == otherObject)
            return true;
        //2.判断null, 返回false
        if(otherObject == null)
            return false;
        // 3. 判断真实类是否相等
        if(getClass() != otherObject.getClass())
            return false;
        // 4. 既然已经确认类相等, 就可以放心的强制类型转换
        var object = (Employee) otherObject;
        return Objects.equals(name, object.name) && salary == object.salary && Objects.equals(hireDate, object.hireDate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDate);
    }
    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDate="
                + hireDate + "]";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
