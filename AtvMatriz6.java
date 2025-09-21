import java.util.Scanner;
import java.util.Arrays;


public class AtvMatriz6 {
    
    public static void main (String[] args) {
        int [][] matriz = new int[5][5];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite os valores para a matriz:");
        for (int i = 0; i < matriz.length; i ++ ) {
            for (int j = 0; j < matriz.length; j ++) {
                System.out.println("Posição [" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();
                if ( i == j) {
                    matriz[i][j] = 1;
                } else
                    matriz[i][j] = 0;
            }
        }
        System.out.println(Arrays.deepToString(matriz));
        
    }
    
}
   