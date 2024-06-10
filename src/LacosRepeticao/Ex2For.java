package LacosRepeticao;

import java.util.Scanner;

public class Ex2For {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, somaNumerosPares = 0, somaNumerosImpares = 0;
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("\nDigite um número");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				somaNumerosPares++;
			} else {
				somaNumerosImpares++;
			}
		}
		
		System.out.println("Quantidade de números pares: "+somaNumerosPares);
		System.out.println("Quantidade de números ímpares: "+somaNumerosImpares);

	}

}
