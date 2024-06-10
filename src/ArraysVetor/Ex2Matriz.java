package ArraysVetor;

import java.util.Scanner;

public class Ex2Matriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float notas[][] = new float[10][4];
		float medias[] = new float [10];
		int linha, coluna;
		float somaNotas = 0;
		
		for(linha = 0; linha < 10; linha++) {
			for(coluna = 0; coluna < 4; coluna++) {
				System.out.println("Digite a nota do "+(coluna+1)+
						"º bimestre do aluno "+(linha+1)+": ");
				notas[linha][coluna] = leia.nextFloat();
				somaNotas += notas[linha][coluna];
			}
			medias[linha] = somaNotas / 4;
			somaNotas = 0;
		}
		
		System.out.print("Lista com a média de cada aluno:\n");
		for(int i = 0; i < 10; i++) {
			System.out.printf("Aluno: %d | Média: %.1f\n",(i+1),medias[i]);
		}
		
	}

}
