package com.mycompany.practical_03_2;

public class Employee {
    private String name;
    private double salary;
    private double bonus;

    public Employee(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public double getBonusAmount() {
        return salary + bonus;
    }

    public String toString() {
        return "Employee Name: " + name + "\n" +
                "Basic Salary: " + salary + "\n" +
                "Bonus: " + bonus + "\n" +
                "Bonus Amount: " + getBonusAmount();
    }
}