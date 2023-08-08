package VetoresMatrizes;
import java.util.Scanner;
public class Matriz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] [] numeros = new int [3][3];
		int l,c, SomaDPrincipal=0, SomaDSecundaria=0;
		String elementosDPrincipal="", elementosDSecundaria="";
		
		Scanner leia= new Scanner (System.in);
		
		for(l=0;l<3;l++) {
			for (c=0;c<3;c++) {
				System.out.printf("\nDigite um número na posição [%d][%d]:  ",l,c);
				numeros[l][c] = leia.nextInt();
				
				if(l == c) { // para saber os elementos da diagonal principal
					elementosDPrincipal += numeros[l][c]+" ";
					SomaDPrincipal += numeros[l][c];
				}
				
				if(l+c == 2) {//para saber os elementos da diagonal secundária
					elementosDSecundaria += numeros[l][c]+" ";
					SomaDSecundaria += numeros[l][c];
				}
			}
		}
		System.out.println("\nElementos da diagona principal: "+elementosDPrincipal);
		System.out.println("\nElementos da diagona secundaria: "+elementosDSecundaria);
		System.out.println("\nSomatório dos elementos da diagona principal: "+SomaDPrincipal);
		System.out.println("\nSomatório dos elementos da diagona secundaria: "+SomaDSecundaria);
		
	}
		
		
	}


