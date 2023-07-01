package com.mycompany.practical_02;

public class Practical_02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Item item = new Item(10, "This is a sword");
        System.out.println(item.getLocation());
        System.out.println(item.getDescription());

        Monster monster = new Monster(20, "This is a dragon");
        System.out.println(monster.getLocation());
        System.out.println(monster.getDescription());
    }
}
