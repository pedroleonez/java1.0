package POO.VETORES;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }
        System.out.println();

        int soma = 0;
        System.out.println("NÚMEROS PARES:");
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                soma += 1;
                System.out.print(vect[i] + "  ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("QUANTIDADE DE PARES = " + soma);

        sc.close();
    }
}
