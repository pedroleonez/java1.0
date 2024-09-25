package POO.ITP;

import java.util.Locale;
import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double temperatura = sc.nextDouble();
        char escala = sc.next().charAt(0);
        double c, f, k;

        if (Character.toLowerCase(escala) == 'c') {
            c = temperatura;
            f = c * 1.8 + 32;
            k = c + 273.15;
        } else if (Character.toLowerCase(escala) == 'f') {
            f = temperatura;
            c = (f - 32) / 1.8;
            k = (f - 32) * 5/9 + 273.15;
        } else {
            k = temperatura;
            c = k - 273.15;
            f = (k - 273.15) * 1.8 + 32;
        }

        System.out.printf("Celsius: %.2f%n", c);
        System.out.printf("Farenheit: %.2f%n", f);
        System.out.printf("Kelvin: %.2f", k);

        sc.close();
    }
}
