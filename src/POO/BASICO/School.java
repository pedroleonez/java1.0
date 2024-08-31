package POO.BASICO;

import java.util.Locale;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();

        student.finalGrade();
        student.approval();

        sc.close();
    }
}
