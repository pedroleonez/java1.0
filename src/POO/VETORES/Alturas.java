package POO.VETORES;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Pessoa[] pessoa = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            pessoa[i] = new Pessoa(nome, idade, altura);
        }
        System.out.println();

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += pessoa[i].getAltura();
        }
        double media = soma / n;

        System.out.printf("Altura média: %.2f%n", media);

        int menosDe16 = 0;
        for (int i = 0; i < n; i++) {
            if (pessoa[i].getIdade() < 16) {
                menosDe16 += 1;
            }
        }

        System.out.println("Pessoas com menos de 16 anos: " + (menosDe16 * 100 / n) + "%");

        for (int i = 0; i < n; i++) {
            if (pessoa[i].getIdade() < 16) {
                System.out.println(pessoa[i].getName());
            }
        }

        sc.close();
    }
}
