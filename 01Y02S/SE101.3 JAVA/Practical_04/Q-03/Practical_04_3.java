package com.mycompany.practical_04_3;

public class Practical_04_3 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setID(1);
        student.setCourse("Computer Science");

        Lecturer lecturer = new Lecturer();
        lecturer.setName("Dr. Jane Smith");
        lecturer.setID(1001);
        lecturer.setProg("Software Engineering");

        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getID());
        System.out.println("Course: " + student.getCourse());
        System.out.println();

        System.out.println("Lecturer Details:");
        System.out.println("Name: " + lecturer.getName());
        System.out.println("ID: " + lecturer.getID());
        System.out.println("Programme: " + lecturer.getProg());
    }
}
