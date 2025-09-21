import java.util.Scanner;
import java.util.Arrays;

public class AtvMatriz3 {

    public static void main(String[] args) {
        int[][] matriz;

        matriz = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.println("Digite um numero inteiro:");
                matriz[i][j] = sc.nextInt();
            }

        }

        System.out.println(Arrays.deepToString(matriz));
    }
}
