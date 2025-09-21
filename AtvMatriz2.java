import com.sun.source.doctree.VersionTree;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class AtvMatriz2 {

    public static void main(String[] args) {
        int[] vetor;
        int[] impar;
        int[] pares;
        Random ale = new Random();

        vetor = new int[15];
        impar = new int[15];
        pares = new int[15];

        Scanner sc = new Scanner(System.in);

        int valor = 0;

        for (int i = 0; i < 15; i++) {
            int numeroAle = ale.nextInt(100);
            vetor[i] = numeroAle;
            valor = vetor[i];

            if (valor % 2 == 0) {
                pares[i] = valor;
            } else {
                impar[i] = valor;
            }


        }
        System.out.println("Os valores pares são:" + Arrays.toString(pares));
        System.out.println("Os valores impares são:" +Arrays.toString(impar));
        System.out.println("Todos os valores digitados são:" + Arrays.toString(vetor));
    }
}

