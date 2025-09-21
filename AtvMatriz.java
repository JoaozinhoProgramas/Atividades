import java.util.Scanner;

public class AtvMatriz {

    public static void main(String[] args) {
        int[] vetor;
        vetor = new int[10];
        int maior = 0;
        int menor = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
                System.out.println("Digite um valor");
                vetor[i] = sc.nextInt();

                if(vetor[i] > vetor[maior]) {
                    maior = i;
                } else if(vetor[i] < vetor[menor]){
                    menor = i;
                }
            }

            System.out.println("O maior valor é:" + vetor[maior] + " e o menor valor é:" + vetor[menor]);
        }
    }

