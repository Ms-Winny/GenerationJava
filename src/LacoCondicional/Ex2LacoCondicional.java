package LacoCondicional;

import java.util.Scanner;

public class Ex2LacoCondicional {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String pergunta1, pergunta2, pergunta3; 
		
		System.out.println("O animal é um Vertebrado ou Invertebrado?");
		pergunta1 = leia.nextLine();
		
		if (pergunta1.equalsIgnoreCase("Vertebrado")) {
			System.out.println("Esse animal vertebrado é uma Ave ou Mamífero? (Escreva o nome exatamente igual por favor)");
			pergunta2 = leia.nextLine();
			
			if(pergunta2.equalsIgnoreCase("Ave")) {
				System.out.println("Qual a dieta dessa Ave? (Carnívoro ou Onívoro)");
				pergunta3 = leia.nextLine();
				
				if (pergunta3.equalsIgnoreCase("Carnívoro")) {
					System.out.println("Essas características pertecem a uma Águia!");
				} else if (pergunta3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Essas características pertecem a uma Pomba!");
				}
				
			} else if (pergunta2.equalsIgnoreCase("Mamífero")) {
				System.out.println("Qual a dieta desse Mamífero? (Herbívoro ou Onívoro)");
				pergunta3 = leia.nextLine();
				
				if (pergunta3.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Essas características pertecem a uma Vaca!");
				} else if (pergunta3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Essas características pertecem ao Ser Humano!");
				}
			}
		}
		if (pergunta1.equalsIgnoreCase("Invertebrado")) {
			System.out.println("Esse animal invertebrado é um Inseto ou Anelídeo? (Escreva o nome exatamente igual por favor)");
			pergunta2 = leia.nextLine();
			
			if(pergunta2.equalsIgnoreCase("Inseto")) {
				System.out.println("Qual a dieta desse Inseto? (Hematófago ou Herbívoro)");
				pergunta3 = leia.nextLine();
				
				if (pergunta3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Essas características pertecem a uma Pulga!");
				} else if (pergunta3.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Essas características pertecem a uma Lagarta!");
				}
				
			} else if (pergunta2.equalsIgnoreCase("Anelídeo")) {
				System.out.println("Qual a dieta desse Anelídeo? (Hematófago ou Onívoro)");
				pergunta3 = leia.nextLine();
				
				if (pergunta3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Essas características pertecem a um Sanguessuga!");
				} else if (pergunta3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Essas características pertecem a uma Minhoca!");
				}
			}
		}
	}

}
