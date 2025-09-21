import java.util.Scanner;
import java.util.Arrays;


public class AtvMatriz5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[3][3];
        
        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < matriz.length ; i ++ ) {
            for (int j = 0; j < matriz.length ; j ++) {
                System.out.println("Valor para a posição[" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }
        for( int i = 0; i < 3; i ++) {
            int somaL = 0;
            for (int j = 0; j < 3; j ++) {
                somaL += matriz[i][j];
            }
            System.out.println("Linha " + i + ": " + somaL);
    }
        for( int j = 0; j < 3; j ++) {
                int somaC = 0;
                for (int i = 0; i < 3; i ++) {
                    somaC += matriz[i][j];
                }
                System.out.println("Coluna " + j + ": " + somaC);
        }
        
        System.out.println(Arrays.deepToString(matriz));
    }
    
}