package chapter_5.inheritance;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int dayofmonth, double bonus ) {
        super(name, salary, year, month, dayofmonth);
        this.bonus = bonus;
    }

    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
