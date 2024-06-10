package Collections;

import java.util.*;

import FuncoesProprias.MenuOpcoes;

public class Ex1Queue extends MenuOpcoes {

	public static void main(String[] args) throws InterruptedException {
		Scanner ler = new Scanner(System.in);
		Queue<String> filaDeClientes = new LinkedList<String>();
		int opcao, opcaoSecundaria;
		String nomeCliente;

		do {
			menuOpcoes();
			System.out.println("\nDigite a opção desejada:");
			opcao = ler.nextInt();

			switch (opcao) {
			case 1:
				do {
					System.out.println("\nDigite o nome do cliente:");
					ler.nextLine();
					nomeCliente = ler.nextLine();
					filaDeClientes.add(nomeCliente);
					if (filaDeClientes.contains(nomeCliente)) {
						System.out.println("Cliente adicionado com sucesso!");
					} else {
						System.out.println("Ocorreu um erro ao adicionar o cliente, tente novamente.");
					}

					Thread.sleep(1000);

					System.out.println("\nDeseja adicionar outro cliente?" + "\n1- Sim" + "\n2- Não");
					opcaoSecundaria = ler.nextInt();

				} while (opcaoSecundaria != 2);

				break;
			case 2:
				System.out.println("Lista de clientes na fila:");

				if (filaDeClientes.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					Iterator<String> iClientes = filaDeClientes.iterator();
					while (iClientes.hasNext()) {
						System.out.println(iClientes.next());
					}
				}

				System.out.println();
				Thread.sleep(1000);
				break;

			case 3:
				if (filaDeClientes.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println(filaDeClientes.poll() + " foi chamado(a)!");
				}
				Thread.sleep(1000);
				
			case 0:
				System.out.println("Programa finalizado!");
				break;
				
			default:
				System.out.println("Opção inválida!");
				Thread.sleep(1000);
			}

		} while (opcao != 0);

	}

}
