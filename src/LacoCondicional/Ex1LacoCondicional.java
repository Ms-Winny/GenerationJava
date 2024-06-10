package LacoCondicional;

import java.util.Scanner;

public class Ex1LacoCondicional {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		String resposta;
		boolean doou = false;
		
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();	
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nJá doou sangue anteriormente? Responda S ou N: ");
		resposta = leia.nextLine();
		leia.nextLine(); //Adicionado pois o leia anterior estava sendo pulado
		
		if (resposta == "S") {
			doou = true;
		} else if (resposta == "N") {
			doou = false;
		}
		
		if (idade > 17 && idade < 60) {
			System.out.println(nome+", você pode doar sangue.");
		} else if (idade >= 60 && idade < 70 && doou == true) {
			System.out.println(nome+", você pode doar sangue.");
		} else {
			System.out.println(nome+", você não pode doar sangue.");
		}

	}

}
