package POO.TERCEIRIZADO.application;

import POO.TERCEIRIZADO.entities.Employee;
import POO.TERCEIRIZADO.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");

            System.out.print("Outsourced (y/n): ");
            char outsource = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (outsource == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(i - 1, employee);
            } else {
                list.add(i - 1, new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee i : list) {
            System.out.printf("%s - $ %.2f%n", i.getName(), i.payment());
        }

        sc.close();
    }
}
