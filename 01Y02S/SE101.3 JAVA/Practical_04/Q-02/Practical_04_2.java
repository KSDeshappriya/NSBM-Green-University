package com.mycompany.practical_04_2;

public class Practical_04_2 {
    public static void main(String[] args) {
        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println(b.returnIt());

        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println(c.returnIt());
    }
}

/* *OutPut:
    9
    11

Explanation:
    The code creates two objects, b and c, of classes SuperB and SubC respectively.

    For object b:
        The setIt() method sets x to 2.
        The increase() method increments x by 1.
        The triple() method multiplies x by 3.
        The value of x is printed, resulting in the output 9.

    For object c:
        The setIt() method sets x to 2.
        The increase() method increments x by 1.
        The triple() method in SubC adds 3 to x.
        The value of x is printed, resulting in the output 11.
*/