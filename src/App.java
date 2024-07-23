import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // String nome = "maria";
        // int idade = 31;
        // double renda = 4000.0;
        
        // System.out.printf("%s tem %d anos e ganha R$ %.2f reais.", nome, idade, renda);


        // Scanner sc = new Scanner(System.in);

        // String x;
        // x = sc.next();
        // System.out.println("você digitou: " + x);

        // sc.close();


        // Scanner sc = new Scanner(System.in);

        // int x;
        // x = sc.nextInt();
        // System.out.println("você digitou o número: " + x);

        // sc.close();


        // Locale.setDefault(Locale.US);
        // Scanner sc = new Scanner(System.in);

        // Double x;
        // x = sc.nextDouble();
        // System.out.printf("você digitou o número: %.2f%n", x);

        // sc.close();


        // Scanner sc = new Scanner(System.in);

        // char x;
        // x = sc.next().charAt(0);
        // System.out.println("você digitou: " + x);

        // sc.close();


        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        Double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
