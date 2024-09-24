package POO.ITP;

import java.util.Scanner;

public class BuchoBurger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int dinheiro = sc.nextInt();
        int valor;

        if (codigo == 1) {
            valor = 12;
            if (dinheiro == valor) {
                System.out.println("Deu certim!");
            } else if (dinheiro > valor) {
                System.out.println("Troco = " + (dinheiro - valor) + " reais");
            } else {
                System.out.println("Saldo insuficiente! Falta " + (valor - dinheiro) + " reais");
            }
        } else if (codigo == 2) {
            valor = 23;
            if (dinheiro == valor) {
                System.out.println("Deu certim!");
            } else if (dinheiro > valor) {
                System.out.println("Troco = " + (dinheiro - valor) + " reais");
            } else {
                System.out.println("Saldo insuficiente! Falta " + (valor - dinheiro) + " reais");
            }
        } else if (codigo == 3) {
            valor = 31;
            if (dinheiro == valor) {
                System.out.println("Deu certim!");
            } else if (dinheiro > valor) {
                System.out.println("Troco = " + (dinheiro - valor) + " reais");
            } else {
                System.out.println("Saldo insuficiente! Falta " + (valor - dinheiro) + " reais");
            }
        } else if (codigo == 4) {
            valor = 28;
            if (dinheiro == valor) {
                System.out.println("Deu certim!");
            } else if (dinheiro > valor) {
                System.out.println("Troco = " + (dinheiro - valor) + " reais");
            } else {
                System.out.println("Saldo insuficiente! Falta " + (valor - dinheiro) + " reais");
            }
        } else {
            valor = 15;
            if (dinheiro == valor) {
                System.out.println("Deu certim!");
            } else if (dinheiro > valor) {
                System.out.println("Troco = " + (dinheiro - valor) + " reais");
            } else {
                System.out.println("Saldo insuficiente! Falta " + (valor - dinheiro) + " reais");
            }
        }


        sc.close();
    }
}