package Referencias;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		String nome = "Weida Winy";
		int idade = 20;
		float altura = 1.76f, nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá mundo!!");
		System.out.println("\nSeu nome é "+nome+", você tem " +idade+ " anos.");
		//char resp = 'S';
		
		System.out.println("Entre com a primeira nota:\n");
		nota1 = leia.nextFloat();
		System.out.println("Entre com a segunda nota:\n");
		nota2 = leia.nextFloat();
		System.out.println("Entre com a terceira nota:\n");
		nota3 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("A média das notas é: %.2f",media);
		
		//Adiciona expoente
		//nota1 = (float) Math.pow(nota3, media);
		
		//Raiz quadrada
		//nota1 = (float) Math.sqrt(media);

	}

}
