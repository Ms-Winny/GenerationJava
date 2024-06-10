package Collections;

import java.util.*;

import FuncoesProprias.MenuOpcoes;

public class Ex1Stack extends MenuOpcoes {

	public static void main(String[] args) {
		Stack<String> pilhaLivros = new Stack<String>();
		Scanner ler = new Scanner(System.in);
		int opcao, opcaoSecundaria;

		do {
			menuStack();
			System.out.println("\nDigite a opção desejada");
			opcao = ler.nextInt();

			switch (opcao) {
			case 1:
				do {
					System.out.println("\nDigite o nome do livro:");
					ler.nextLine();
					String nomeLivro = ler.nextLine();
					pilhaLivros.push(nomeLivro);

					if (pilhaLivros.contains(nomeLivro)) {
						System.out.println("Livro " + nomeLivro + " adicionado ao topo da pilha!");
					} else {
						System.out.println("Ocorreu um erro ao adicionar o livro, tente novamente.");
					}

					System.out.println("\nDeseja adicionar outro livro?" + "\n1- Sim" + "\n2- Não");
					opcaoSecundaria = ler.nextInt();

				} while (opcaoSecundaria != 2);

				break;
			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia!");

				} else {
					System.out.println("Lista de livros na pilha:\n");
					Iterator<String> iLivros = pilhaLivros.iterator();
					while (iLivros.hasNext()) {
						System.out.println(iLivros.next());
					}		
				}
				System.out.println();
				break;

			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha de livros está vazia!");
				} else {
					System.out.println(pilhaLivros.pop() + " foi removido do topo da pilha!");
				}

				System.out.println();

				break;

			case 0:
				System.out.println("Programa finalizado!");
				break;

			default:
				System.out.println("Opção inválida!");

			}

		} while (opcao != 0);

	}

}
