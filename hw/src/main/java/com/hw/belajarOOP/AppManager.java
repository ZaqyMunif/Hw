package com.hw.belajarOOP;

public class AppManager {
    public static void main(String[] args) {
        var manager = new Manager(null);
        manager.name = "Joe";
        manager.sayHello("Firdaus");

        var vicePresident = new VicePresident(null);
        vicePresident.name = "Moh";
        vicePresident.sayHello("Joe");
        ;
    }
}