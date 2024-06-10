package LacosRepeticao;

import java.util.Scanner;

public class Ex1DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, somaNumeros = 0;
		
		do {
			System.out.println("Digite um número:");
			numero = leia.nextInt();
			if(numero > 0) {
				somaNumeros += numero;
			}
			
		} while(numero != 0);
		
		System.out.println("Soma dos números positivos: "+somaNumeros);
	}

}
