package EstruturaDados;

import java.util.*;

public class ColecaoExemplo {

	public static void main(String[] args) throws InterruptedException {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList<String>();
		
		int opcao, opcaoSecundaria;
		String produto, remocao;
		
		do {
			System.out.println("\n============================");
			System.out.println("Menu de opções do Estoque");
			System.out.println("============================");
			
			System.out.println("\n1 - Adicionar produtos ao estoque");
			System.out.println("\n2 - Remover produtos ao estoque");
			System.out.println("\n3 - Atualizar produtos do estoque");
			System.out.println("\n4 - Mostrar produtos do estoque");
			System.out.println("\n0 - Encerrar o menu de estoque");
			
			System.out.println("\nDigite o número da operação:");
			opcao = ler.nextInt();
			
			switch(opcao) {
				case 1:
					do {
						System.out.println("\nDigite o produto para adicionar ao estoque");
						
						ler.nextLine();
						produto = ler.nextLine();
						if(estoque.contains(produto)) {
							System.out.println("Falha na operação, produto já existe no estoque!");
							Thread.sleep(1000);
						} else {
							estoque.add(produto);
							System.out.println("\nProduto adicionado com sucesso!");
							Thread.sleep(1000);
						}
						System.out.println("\nDeseja adicionar outro produto? "
								+ "\n1- Sim, desejo adicionar outro produto "
								+ "\n2- Não, voltar para o menu de opções");
						opcaoSecundaria = ler.nextInt();
						
					} while(opcaoSecundaria != 2);
					Thread.sleep(1000);
					break;
					
				case 2:
					System.out.println("\nDigite o produto para remover do estoque");
					ler.nextLine();
					remocao = ler.nextLine();
					
					if(estoque.contains(remocao)) {
						estoque.remove(remocao);
						System.out.println("\nProduto "+remocao+" removido do estoque!");
						Thread.sleep(1000);
						
					} else {
						System.out.println("Produto não encontrado no estoque!");
						Thread.sleep(1000);
						break;
					}
					break;
					
				case 3:
					String antigoProduto, novoProduto;
					
					System.out.println("\nDigite o produto que quer atualizar");
					ler.nextLine();
					antigoProduto = ler.nextLine();
					
					if(estoque.contains(antigoProduto)) {
						System.out.println("\nDigite o produto que irá entrar no lugar do produto "+antigoProduto);
						novoProduto = ler.nextLine();
						estoque.add(novoProduto);
						if(estoque.contains(novoProduto) && !estoque.contains(antigoProduto)) {
							System.out.println("\nProduto atualizado com sucesso!");
						} else {
							System.out.println("Ocorreu uma falha na operação, tente novamente.");	
						}
					} else {
						System.out.println("\nProduto não encontrado no estoque!");
					}
					Thread.sleep(1000);
					break;
				
				case 4:
					if(estoque.isEmpty()) {
						System.out.println("O estoque encontra-se vazio!");
						Thread.sleep(1000);
					} else {
					System.out.println(estoque);
					}
					break;
			}
			
		} while(opcao != 0);

	}

}
