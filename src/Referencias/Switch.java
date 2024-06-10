package Referencias;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		//sysout + ctrl espaço cria um System.out.println()
		
				Scanner leia = new Scanner(System.in);
				int op;
				
				System.out.println("\n\t\tMenu de elogios");
				System.out.println("\n1 - Empáticos");
				System.out.println("\n2 - Incríveis");
				System.out.println("\n3 - Galera bonita");
				System.out.println("\n4 - Fofos");
				
				System.out.println("\nPor favor digite a opção do elogio: ");
				op = leia.nextInt();
				
				switch(op) {
				case 1: 
					System.out.println("\nOs alunos da turma 75 são empáticos!");
					break;
				case 2: 
					System.out.println("\nEles são incríveis!");
					break;
				case 3: 
					System.out.println("\nMó galera bonita!");
					break;
				case 4: 
					System.out.println("\nEles são muito fofinhos");
					break;
				default: 
					System.out.println("\nOpção inválida");
					break;
					
				}
	}

}
