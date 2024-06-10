package LacoCondicional;

import java.util.Scanner;

public class Ex1SwitchCase {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numeroProduto, quantidade;
		float valorTotal;
		
		System.out.println("Digite o número do produto:");
		numeroProduto = leia.nextInt();
		System.out.println("\nDigite a quantidade comprada:");
		quantidade = leia.nextInt();
		
		switch(numeroProduto) {
		case 1:
			valorTotal = quantidade * 10;
			System.out.printf("Produto: Cachorro-Quente\nValor total: %.2f",valorTotal);
			break;
		case 2:
			valorTotal = quantidade * 15;
			System.out.printf("Produto: X-Salada\nValor total: %.2f",valorTotal);
			break;
		case 3:
			valorTotal = quantidade * 18;
			System.out.printf("Produto: X-Bacon\nValor total: %.2f",valorTotal);
			break;
		case 4:
			valorTotal = quantidade * 12;
			System.out.printf("Produto: Bauru\nValor total: %.2f",valorTotal);
			break;
		case 5:
			valorTotal = quantidade * 8;
			System.out.printf("Produto: Refrigerante\nValor total: %.2f",valorTotal);
			break;
		case 6:
			valorTotal = quantidade * 13;
			System.out.printf("Produto: Suco de Laranja\nValor total: %.2f",valorTotal);
			break;
		}

	}

}
