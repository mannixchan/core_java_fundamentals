package chapter_5.equalsTest;

import java.util.Objects;

public class Manager extends Employee{
    private double bonus;
    public Manager(String name, double salary, int year, int month, int dayOfMonth, double bonus) {
        super(name, salary, year, month, dayOfMonth);
        this.bonus = bonus;
    }
    @Override
    public boolean equals(Object otherObject) {
        if(!super.equals(otherObject)) return false;
        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }
    @Override
    public String toString() {
        return super.toString() + "[bonus=" + this.bonus + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.getName(), super.getSalary(), super.getHireDate(), bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
