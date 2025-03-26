package org.example;

public class Main {
    public static void main(String[] args) {
        Tester.staticGreeting();
        Tester tester1 = new Tester("Alice", "Smith", 3, "Advanced", 1500.0);
        tester1.showDetails();
        tester1.showDetails(true);
        tester1.showDetails(true, true);
    }
}