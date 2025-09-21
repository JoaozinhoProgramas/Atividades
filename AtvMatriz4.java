import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AtvMatriz4 {
    public static void main(String[] args) {
        int[][] matriz;

        matriz = new int[4][4];

        Scanner sc = new Scanner(System.in);
        Random ale = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int numeroAle = ale.nextInt(100);
                matriz[i][j] = numeroAle;
                }

            }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j]);
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
