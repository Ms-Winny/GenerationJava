package LacosRepeticao;

import java.util.Scanner;

public class Ex1While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int idade, mediaIdade = 0, identidadeDeGenero = 0, numeroMulheresFrontEnd = 0, pessoaDesenvolvedora = 0, totalPessoas = 0, numeroHomensMobile40 = 0,
		NaoBinariosFullstack = 0, numeroDeBackend = 0;
		String opcao = "S";
		
		while(!opcao.equalsIgnoreCase("N")) {
			
			System.out.println("Digite a idade:");
			idade = leia.nextInt();
			totalPessoas++;
			mediaIdade += idade;
			
			System.out.println("\nDigite o número que corresponde à sua identidade de gênero:");
			System.out.println("\n1- Mulher Cis "
					+ "\n2- Homem Cis "
					+ "\n3- Não Binário "
					+ "\n4- Mulher Trans "
					+ "\n5- Homem Trans "
					+ "\n6- Outros");
			identidadeDeGenero = leia.nextInt();
			
			System.out.println("\nDigite o número que corresponde ao tipo de desenvolvedor que você é:");
			System.out.println("\n1- Back-End"
					+ "\n2- Front-End"
					+ "\n3- Mobile"
					+ "\n4- FullStack");
			pessoaDesenvolvedora = leia.nextInt();
			
			if(identidadeDeGenero == 1 || identidadeDeGenero == 4) {
				if(pessoaDesenvolvedora == 2) {
					numeroMulheresFrontEnd++;
				}
			}
			if (identidadeDeGenero == 2 || identidadeDeGenero == 5) {
				if(pessoaDesenvolvedora == 3 && idade > 40) {
					numeroHomensMobile40++;
				}
			}
				
			if(identidadeDeGenero == 3 && pessoaDesenvolvedora == 4 && idade < 30) {
				NaoBinariosFullstack++;
			}
			
			if(pessoaDesenvolvedora == 1) {
				numeroDeBackend++;
			}
			
			System.out.println("Você quer cadastrar mais um colaborador? (Digite S ou N)");
			opcao = leia.next();		
		}
			mediaIdade = mediaIdade / totalPessoas;
			
		System.out.println("Número de pessoas desenvolvedoras Backend: "+numeroDeBackend);
		System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend: "+numeroMulheresFrontEnd);
		System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+numeroHomensMobile40);
		System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos: "+NaoBinariosFullstack);
		System.out.println("O número total de pessoas que responderam à pesquisa: "+totalPessoas);
		System.out.println("A média de idade das pessoas que responderam à pesquisa: "+mediaIdade);
	}
}
