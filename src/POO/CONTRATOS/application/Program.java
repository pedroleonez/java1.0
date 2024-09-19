package POO.CONTRATOS.application;

import POO.CONTRATOS.entities.Department;
import POO.CONTRATOS.entities.Worker;
import POO.CONTRATOS.entities.enums.WorkerLevel;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Worker level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, new Department(departmentName), baseSalary, WorkerLevel.valueOf(workerLevel));



        sc.close();
    }
}
