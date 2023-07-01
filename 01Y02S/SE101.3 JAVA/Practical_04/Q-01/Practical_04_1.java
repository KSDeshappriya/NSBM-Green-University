package com.mycompany.practical_04_1;

public class Practical_04_1 {
    public static void main(String[] args) {
        Employee bogdan = new Employee();
        bogdan.setEmpID(1);
        bogdan.setEmpName("Mr. Bogdan");
        bogdan.setEmpDesignation("Manager");

        Employee bird = new Employee();
        bird.setEmpID(2);
        bird.setEmpName("Ms. Bird");
        bird.setEmpDesignation("Engineer");

        System.out.println("Employee Details:");
        System.out.println("ID: " + bogdan.getEmpID());
        System.out.println("Name: " + bogdan.getEmpName());
        System.out.println("Designation: " + bogdan.getEmpDesignation());
        System.out.println();

        System.out.println("Employee Details:");
        System.out.println("ID: " + bird.getEmpID());
        System.out.println("Name: " + bird.getEmpName());
        System.out.println("Designation: " + bird.getEmpDesignation());
    }
}
