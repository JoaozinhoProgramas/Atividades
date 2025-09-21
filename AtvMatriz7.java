import java.util.Scanner;
import java.util.Arrays;


public class AtvMatriz7 {
    
    public static void main (String[] args) {
        int linha = 3;
        int coluna = 2;
        
        int [][] matriz = new int[linha][coluna];
        int [][] matrizInv = new int[coluna][linha];
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Digite os valores da matriz");
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 2; j ++) {
                System.out.println("Valor [" + i + "][" + j + "]" );
                matriz[i][j] = sc.nextInt();
                matrizInv[j][i] = matriz[i][j];
            }
        }
        System.out.println(Arrays.deepToString(matriz));
        System.out.println(Arrays.deepToString(matrizInv));
    }
}
   