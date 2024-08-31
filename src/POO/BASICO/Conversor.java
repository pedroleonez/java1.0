package POO.BASICO;

import java.util.Locale;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        CurrencyConverter.price = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        CurrencyConverter.amount = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.conversor());

        sc.close();
    }
}
