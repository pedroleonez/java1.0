package POO.MATRIZES;

import java.util.Locale;
import java.util.Scanner;

public class Direcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        System.out.println();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j);
                    if (j - 1 >= 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (j + 1 < n) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i - 1 >= 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (i + 1 < m) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                    System.out.println();
                }
            }
        }

        sc.close();
    }
}
