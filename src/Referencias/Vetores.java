package Referencias;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float[] media = new float[4];
		float n1, n2, n3, somaMedia = 0, mediaGeral;
		int x;
		
		for (x = 0; x < 4; x++) {
			System.out.println("Digite a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("Digite a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("Digite a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1 + n2 + n3)/ 3;
			somaMedia += media[x];
		}
		
		mediaGeral = somaMedia / x;
		System.out.printf("Média geral: %.1f\n",mediaGeral);
		
		for(x = 0; x < 4; x++ ) {
			System.out.printf("\nMédia do partipante "+(x+1)+" foi de: %.1f",media[x]);
		}

	}

}
