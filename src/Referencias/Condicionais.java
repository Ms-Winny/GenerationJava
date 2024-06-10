package Referencias;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		float n1, n2, n3, media;
		String nome;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: \n");
		nome = leia.nextLine();
		
		System.out.println("Digite a primeira nota: \n");
		n1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: \n");
		n2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota: \n");
		n3 = leia.nextFloat();
		
		media = (n1 + n2+ n3)/3;
		
		if(media < 6) {
			System.out.printf("%s, você foi reprovado(a)! Com uma média de: %.1f",nome,media);	
		} else if(media >= 6 && media <= 7){
			System.out.println(nome+ ", você ficou de exame!");
		} else {
			System.out.println(nome+ ", você foi aprovado(a)!");
		}
		
		/*
		 
		 %s serve para strings
		 %d serve para inteiros
		 %f serve para float 
		 \n pula linha
		 \t pula 4 espaços
		 
		printf - f = formatado, formata a resposta;
		println - ln = linha, pula a linha
		 
		 */
	}

}
