package VetoresMatrizes;
import java.util.Scanner;
public class Vetores01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetor = {2,5,1,3,4,9,7,8,10,6};
		int numero,x, posicao=0;
		
		Scanner leia= new Scanner(System.in); 
		
		System.out.println("Digite o numero que deseja encontrar:");
		numero=leia.nextInt();
		
		for(x=0; x<10;x++) {
			if (vetor[x]==numero) {
				System.out.printf("\nO numero %d está localizado da posição:%d",vetor[x],x);
				
			}else{
				posicao++;
				
			}
		}
		if (posicao==10) {
			System.out.printf("\nO numero não foi encontrado:",numero);
		}
	}

}
