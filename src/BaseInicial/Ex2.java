package BaseInicial;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:\n");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota:\n");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota:\n");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota:\n");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("A média é: %.1f",media);
	}

}
