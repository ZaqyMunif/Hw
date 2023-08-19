package com.hw;

public class MethodOverloading {

    static String sayHeloo(String firstName) {
        return firstName;
    }

    static String sayHeloo(String firstName, String lastName) {

        return firstName + lastName;
    }

    static int tambah(int var1, int var2) {
        return var1 + var2;
    }

    static String tambah(String var1, String var2) {
        return var1 + " tambah " + var2;
    }

    public static void main(String[] args) {

        System.out.println(sayHeloo("Steven ", "Ahmad"));
        System.out.println(sayHeloo("Hello"));
        System.out.println(tambah(1, 2));
        System.out.println(tambah("satu", "dua"));
    }
}
