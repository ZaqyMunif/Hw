package com.hw;

public class ErrorStackOverflow {
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        }
        else {
            System.out.println("Loop-" + value);
            loop(value - 1);
        }
    }
}
