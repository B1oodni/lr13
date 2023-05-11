package com.zadan2.testers;

public class Testers {

    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    //Конструкторы
    public Testers(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Testers(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0.0);
    }

    public Testers(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intertament");
    }

    //Методы
    public void test(String systemName) {
        System.out.println("Name: " + systemName);
    }

    public void test(int numberlaba) {
        System.out.println("Number: " + numberlaba);
    }

    public void test(boolean isWorking) {
        System.out.println("Laba is working: " + isWorking);
    }

    public void test(boolean isWorking, int sd) {
        System.out.println("Laba is working: " + isWorking + " " + sd);
    }





    public double calculateSalaryPerHour() {
        return salary;
    }

    public double calculateSalaryPerMonth() {
        return salary * 528.0;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public static void printTesterInfo(Testers tester) {
        System.out.println("Name: " + tester.name);
        System.out.println("Surname: " + tester.surname);
        System.out.println("Experience in years: " + tester.experienceInYears);
        System.out.println("English level: " + tester.englishLevel);
        System.out.println("Salary per hour: " + tester.calculateSalaryPerHour());
        System.out.println("Salary per month: " + tester.calculateSalaryPerMonth());
    }
}
