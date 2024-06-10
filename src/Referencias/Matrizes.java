package Referencias;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			
		int[][] matriz = new int[2][2];
		int linha, coluna, somaValor=0;
		float mediaValor;
			
		for(linha = 0; linha < 2; linha++) {
			for (coluna = 0; coluna < 2; coluna++) {
				System.out.println("Digite o valor da linha "+linha+" e coluna "+coluna);
				matriz[linha][coluna] = leia.nextInt();
				somaValor += matriz[linha][coluna];
			}
		}
			
		System.out.println("A soma de todos os valores é "+somaValor);

	}

}
