package com.zadan2.testers;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter experience in years: ");
        int experienceInYears = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter English level: ");
        String englishLevel = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        Testers tester = new Testers(name, surname, experienceInYears, englishLevel, salary);

        System.out.println("Tester's full name: " + tester.getFullName());
        System.out.println("Tester's salary per hour: " + tester.calculateSalaryPerHour());
        System.out.println("Tester's salary per month: " + tester.calculateSalaryPerMonth());

        System.out.println();
        System.out.println("Info:");
        System.out.println();

        Testers.printTesterInfo(tester);

        System.out.println();
        System.out.println("Methods:");
        System.out.println();

        tester.test("Laba Maven");
        tester.test(12);
        tester.test(true);
        tester.test(true, 2);

    }
}
