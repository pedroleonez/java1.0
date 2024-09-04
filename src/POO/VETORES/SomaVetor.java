package POO.VETORES;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.print(vect[i] + "   ");
        }
        System.out.println();

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        System.out.printf("SOMA =  %.2f%n", soma);

        double media = soma / n;

        System.out.printf("MEDIA = %.2f%n", media);

        sc.close();
    }
}
