package com.mycompany.practical_03_2;

public class Employee {
    private String name;
    private double basicSalary;
    private double bonus;

    // Constructor
    public Employee(String name, double basicSalary, double bonus) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    // Bonus Amount Calculation
    public double calculateBonusAmount() {
        return basicSalary + bonus;
    }
}
