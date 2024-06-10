package LacoCondicional;

import java.util.Scanner;

public class Ex2SwitchCase {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float saldo = 1000, valor = 0;
		int operacao;
		
		System.out.println("Operações diponíveis: \n1- Saldo \n2- Saque \n3- Depósito");
		System.out.println("\nDigite o número da operação desejada:\n");
		operacao = leia.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.printf("\nOperação - Saldo \nSaldo disponível: R$%.2f",saldo);
			break;
		case 2:
			System.out.printf("Digite o valor a ser sacado:\n");
			valor = leia.nextInt();
			if (valor <= saldo) {
				saldo = saldo - valor;
				System.out.printf("\nOperação - Saque \nNovo saldo: %.2f",saldo);
			} else {
				System.out.printf("\nOperação - Saque \nSaldo insufiente!");
			}
			break;
		case 3:
			System.out.printf("Digite o valor a ser depositado:\n");
			valor = leia.nextInt();
			saldo = valor + saldo;
			System.out.printf("\nOperação - Depósito \nNovo saldo: %.2f",saldo);
			break;
		default:
			System.out.printf("Operação inválida!");
		}
	}
}
