package com.hw.belajarOOP;

public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee(" Zaqy");
        employee.sayHello("Budi");

        employee = new Manager("Zaqy");
        employee.sayHello("Budi");

        employee = new VicePresident("Zaqy");
        employee.sayHello("Budi");

        sayHello(new Employee("Zaqy"));
        sayHello(new Manager("Zaqy"));
        sayHello(new VicePresident("Zaqy"));
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello" + employee.name);
    }
}
