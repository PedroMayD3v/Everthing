package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class ApplicationEmloyer {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Outsourced? (y/n) ");
            String request = sc.nextLine();

            if (request.equals("y")) {
                System.out.println("Employee #" + (i + 1) + " Data: ");
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                sc.nextLine(); // Limpar o buffer

                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            } else if (request.equals("n")) {
                System.out.println("Employee #" + (i + 1) + " Data: ");
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                sc.nextLine(); // Limpar o buffer

                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }

        System.out.println("PAYMENTS: ");

        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }
    }
}
