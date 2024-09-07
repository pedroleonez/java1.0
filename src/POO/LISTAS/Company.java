package POO.LISTAS;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(i, new Employee(name, id, salary));

            System.out.println();
        }

        System.out.print("Enter the employee id the will have salary increase : ");
        int idIncrease = sc.nextInt();
        System.out.print("Enter the percentage : ");
        double percentageIncrease = sc.nextDouble();

        Employee employee = list.stream()
                .filter(e -> e.getId() == idIncrease)
                .findFirst()
                .orElse(null);

        if (employee != null) {
            double newSalary = employee.getSalary() * (1 + percentageIncrease / 100);
            employee.setSalary(newSalary);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println();

        System.out.println("List of employees:");

        for (Employee x : list) {
            System.out.printf("%d, %s, %.2f%n", x.getId(), x.getName(), x.getSalary());
        }

        sc.close();
    }
}
