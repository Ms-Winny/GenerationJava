package LacosRepeticao;

import java.util.Scanner;

public class Ex2While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade = 0, quantidadeMenorDe21 = 0, quantidadeMaiorDe50 = 0;
		
		System.out.println("Digite a idade:");
		idade = leia.nextInt();
		
		while(idade > 0) {
			if (idade < 21 ) {
				quantidadeMenorDe21++;
			}else if (idade > 50) {
				quantidadeMaiorDe50++;
			}
			System.out.println("Digite a idade:");
			idade = leia.nextInt();
		}
		System.out.println("Quantidade de menores de 21: "+quantidadeMenorDe21);
		System.out.println("Quantidade de maiores de 50: "+quantidadeMaiorDe50);
	}

}
