package POO.BASICO;

import java.util.Locale;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle_rules rectangle = new Rectangle_rules();

        System.out.println("Enter rectangle width and height: ");

        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        String area = String.format("%.2f" ,rectangle.area());
        String perimeter = String.format("%.2f" ,rectangle.perimeter());
        String diagonal = String.format("%.2f" ,rectangle.diagonal());

        System.out.println("AREA = " + area);
        System.out.println("PERIMETER = " + perimeter);
        System.out.println("DIAGONAL = " + diagonal);

        sc.close();
    }
}
