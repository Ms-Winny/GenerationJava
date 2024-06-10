package ArraysVetor;

import java.util.Scanner;

public class Ex1Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int lista[] = {2,5,1,3,4,9,7,8,10,6};
		int numeroEscolhido;
		boolean encontrado = false;
		
		System.out.print("Digite o número que você deseja encontrar: ");
		numeroEscolhido = leia.nextInt();
		
		for(int i = 0; i < lista.length; i++) {
			if(numeroEscolhido == lista[i]) {
				System.out.println("O número "+numeroEscolhido+" está na posição: "+i);
				encontrado = true;
			}
		}
		
		if(!encontrado) {
			System.out.println("O número "+numeroEscolhido+" não foi encontrado.");
		}
	}

}
