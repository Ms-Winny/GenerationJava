package ArraysVetor;

import java.util.Scanner;

public class Ex1Matriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		int linha, coluna;
		
		System.out.println("Vamos criar uma matriz 3x3 com números inteiros e analisá-la");
		for(linha = 0; linha < 3; linha++ ) {
			for(coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite o número da linha "+linha+" e coluna "+coluna+": ");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		System.out.println("Elementos na diagonal principal: "
				+ ""+matriz[0][0]+" "+matriz[1][1]+" "+matriz[2][2]);
		
		System.out.println("Elementos na diagonal secundária: "
				+ ""+matriz[0][2]+" "+matriz[1][1]+" "+matriz[2][0]);
		
		System.out.println("Soma dos elementos da diagonal principal: "
		+(matriz[0][0]+matriz[1][1]+matriz[2][2]));
		
		System.out.println("Soma dos elementos da diagonal secundária: "+(matriz[0][2]+matriz[1][1]+matriz[2][0]));
	}

}
