import java.util.Scanner;
import java.util.Arrays;

public class AtvMatriz8
{
	public static void main(String[] args) {
		double matriz[][] = new double[5][2];
		
		double nota1 = 0;
		double nota2 = 0;
		double media = 0;
		double mediaDividida = 0;
		
		int index = -1;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++)  {
		    index = i + 1;
		    
		    System.out.println("Digite 1º nota do aluno");
		    nota1 = sc.nextInt();
		    matriz[i][0] = nota1;
		    
		    System.out.println("Digite 2º nota do aluno");
		    nota2 = sc.nextInt();
		    matriz[i][1] = nota2;
		    
		    media = nota1 + nota2;
		    mediaDividida = media / 2.0;
		    
		    System.out.println("O " + index + "º aluno tem as seguintes médias:" + mediaDividida);  
		}
		System.out.println("Banco de dados das notas:" + Arrays.deepToString(matriz));
	}
}