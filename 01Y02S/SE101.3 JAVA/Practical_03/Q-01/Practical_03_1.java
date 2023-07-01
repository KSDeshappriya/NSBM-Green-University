package com.mycompany.practical_03_1;

public class Practical_03_1 {
	
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Bogdan");
        employee.setAge(30);
        employee.setSalary(50000);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee Salary: " + employee.getSalary());
    }
}
