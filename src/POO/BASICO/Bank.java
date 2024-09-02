package POO.BASICO;

import java.util.Locale;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account = new Account();

        System.out.print("Enter account number: ");
        account.setNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter account holder: ");
        account.setName(sc.nextLine());

        char initial;

        System.out.println("Is there an initial deposit (y/n)? ");
        initial = sc.next().charAt(0);

        if (initial == 'y') {
            System.out.print("Enter deposit value: ");
            account.setBalance(sc.nextDouble());
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }
}
