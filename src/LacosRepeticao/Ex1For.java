package LacosRepeticao;

import java.util.Scanner;

public class Ex1For {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int inteiroUm, inteiroDois;
		
		System.out.print("Por favor digite um número inteiro para uma comparação: ");
		inteiroUm = leia.nextInt();
		
		System.out.print("Por favor digite outro número inteiro para ser comparado com o primeiro (Ele precisa ser maior que o primeiro número)\n");
		inteiroDois = leia.nextInt();
		
		if(inteiroUm > inteiroDois) {
			System.out.print("Intervalo inválido!");
			return; // Serve para finalizar o if 
			
		}
		
		for(int primeiroNumero = inteiroUm; primeiroNumero <= inteiroDois; primeiroNumero++) {
			
			if(primeiroNumero % 3 == 0 && primeiroNumero % 5 == 0){
				System.out.print(primeiroNumero+" é múltiplo de 3 e 5\n");
			}
			
		}
		
		leia.close();
	}

}
