package Referencias;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		float n1, n2, n3, media, somaMedia = 0, mediaGeral, maiorMedia = 0;
		int x;
		Scanner leia = new Scanner(System.in);
		
		for(x = 1; x <= 4; x++) {
			System.out.println("\nEntre com a primeira nota:");
			n1 = leia.nextFloat();
			
			System.out.println("\nEntre com a segunda:");
			n2 = leia.nextFloat();
			
			System.out.println("\nEntre com a terceira nota:");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3)/3;
			System.out.printf("\nSua média foi de %.2f:\n",media);
			
			somaMedia += media; // somaMedia = somaMedia + media
			
			if (maiorMedia < media) {
				maiorMedia = media;
			}
			
			/* Gambiarra para limpar o console
			 for(int y=0; y<20; y++) {
				System.out.printf("\n");
			}
			*/
		}
		
		mediaGeral = somaMedia / (x - 1 );
		System.out.printf("\nA média geral foi de: %.1f",mediaGeral);
		System.out.println("\nA maior média foi de: "+maiorMedia);

	}

}
