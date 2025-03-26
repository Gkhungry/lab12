package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name) {
        this(name, "Unknown", 0, "Beginner", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intermediate", 500.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Surname: " + surname);
    }

    public void showDetails(boolean includeExperience) {
        if (includeExperience) {
            System.out.println("Name: " + name + ", Surname: " + surname + ", Experience: " + experienceInYears + " years");
        } else {
            showDetails();
        }
    }

    public void showDetails(boolean includeExperience, boolean includeSalary) {
        if (includeExperience && includeSalary) {
            System.out.println("Name: " + name + ", Surname: " + surname + ", Experience: " + experienceInYears + " years, Salary: " + salary);
        } else {
            showDetails(includeExperience);
        }
    }

    public static void staticGreeting() {
        System.out.println("Welcome to the world of Testers!");
    }
}
