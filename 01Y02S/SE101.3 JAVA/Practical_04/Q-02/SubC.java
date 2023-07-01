package com.mycompany.practical_04_2;

public class SubC extends SuperB {
    void triple() {
        x = x + 3; // Override existing method
    }

    void quadruple() {
        x = x * 4; // New method
    }
}