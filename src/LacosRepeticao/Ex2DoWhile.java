package LacosRepeticao;

import java.util.Scanner;

public class Ex2DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float numero, quantidadeNumeros = 0, somaNumeros = 0, media;

		do {
			System.out.println("Digite um número:");
			numero = leia.nextFloat();
			
			if(numero % 3 == 0 && numero > 0) {
				somaNumeros += numero;
				quantidadeNumeros++;
			}
			
		} while(numero != 0);
		
		media = somaNumeros / quantidadeNumeros;
		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f",media);
	}

}
