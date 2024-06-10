package ArraysVetor;

import java.util.Scanner;

public class Ex2Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[10];
		int numero = 0, somaVetor = 0;
		float mediaVetor;
		
		System.out.println("Vamos criar uma lista com 10 números e analisá-los");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("\nDigite o "+(i+1)+"º número da lista: ");
			vetor[i] = leia.nextInt();
			somaVetor += vetor[i];
		}
		
		mediaVetor = (float) somaVetor / 10;
		
		System.out.print("\nElementos em índices ímpares: ");
		for(int i = 1; i < 10; i+=2) {
				numero = vetor[i];
				System.out.print(numero+" ");			
		}
		
		System.out.print("\nElementos pares: ");
		for(int i = 0; i < 10; i++) {
			if(vetor[i] % 2 == 0) {
				numero = vetor[i];
				System.out.print(numero+" ");			
			}
		}
		System.out.print("\nSoma de todos os elementos: "+somaVetor);
		System.out.printf("\nMédia de todos os elementos: %.2f",mediaVetor);
	}

}
