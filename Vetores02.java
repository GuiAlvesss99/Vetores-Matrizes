package VetoresMatrizes;
import java.util.Scanner;
public class Vetores02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		
		int[] vetor = new int[10];

		 
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            vetor[i] = scanner.nextInt();
        }

      
        System.out.println("\nElementos nos índices ímpares:");
        for (int i = 1; i < vetor.length; i += 2) {
            System.out.print(vetor[i] + " ");
        }

      
        System.out.println("\n\nElementos pares:");
        for (int num : vetor) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

      
        int soma = 0;
        for (int num : vetor) {
            soma += num;
        }

        
        double media = (double) soma / vetor.length;

        
        System.out.println("\n\nSoma: " + soma + "\n\nMédia: " + media);
    }
     
     
     

}
