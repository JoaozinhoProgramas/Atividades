import java.util.Scanner;
import java.util.Arrays;


public class AtvMatriz7 {
    
    public static void main (String[] args) {
        char X = 'X';
        char O = 'O';
        char [][] matriz = new char[3][3];
        Scanner sc = new Scanner(System.in);
        int Escolha = 0;
        int rodadas = 0;
        
        boolean vitoria = false;
        
        System.out.println("==========================");
        System.out.println("=*****JOGO DA VELHA******=");
        System.out.println("==========================");
        System.out.println("Escolha o jogador que começa:");
        System.out.println("1 - Jogador X");
        System.out.println("2 - Jogador O");
        Escolha = sc.nextInt();
        
    
        if (Escolha == 1) {
            System.out.println("\n  0 1 2");
            for (int i = 0; i < 3; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println();
            }
        }
        System.out.println();
    
            
            for (int i = 0; i < 3; i ++) {
                for (int j = 0; j < 3; j ++) {
                    System.out.println("Digite sua escolha, Linha e Coluna");
                    rodadas += 1;
                    int Linha = sc.nextInt();
                    int Coluna = sc.nextInt();
                    matriz[i][j] = O;
                        if (Linha >= 0 && Linha < 3 && Coluna >= 0 && Coluna < 3)  {
                        matriz[Linha][Coluna] = X;
                        System.out.println(Arrays.deepToString(matriz));
                        }
                    
                }
            // validação de vitoria
            if (matriz[0][0] == X && matriz[1][1] == X && matriz[2][2] == X) {
                vitoria = true;
                System.out.println("Você venceu parabens!!");
                break;
            }
            if (matriz[0][2] == X && matriz[1][1] == X && matriz[2][0] == X) {
                vitoria = true;
                System.out.println("Você venceu parabens!!");
                break;
            }
            if (matriz[0][0] == X && matriz[0][1] == X && matriz[0][2] == X) {
                vitoria = true;
                System.out.println("Você venceu parabens!!");
                break;
            }
            if (matriz[1][0] == X && matriz[1][1] == X && matriz[1][2] == X) {
                vitoria = true;
                System.out.println("Você venceu parabens!!");
                break;
            }
            if (matriz[2][0] == X && matriz[2][1] == X && matriz[2][2] == X) {
                vitoria = true;
                System.out.println("Você venceu parabens!!");
                break;
            }
        }
    }
}

   