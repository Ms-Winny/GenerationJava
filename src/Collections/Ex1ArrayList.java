package Collections;

import java.util.*;

public class Ex1ArrayList {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList <String> listaDeCores = new ArrayList<String>();
		String corEscolhida;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor:");
			corEscolhida = ler.nextLine();
			listaDeCores.add(corEscolhida);
		}
		
		System.out.println("\nLista das cores digitadas:\n");
		
		for(String cor:listaDeCores) {
			System.out.print("| "+cor+" ");	
		}	
		System.out.print("|\n");
		System.out.println("\n==============================================================");
		
		System.out.println("\nLista das cores digitadas reordenadas em ordem crescente:\n");
		Collections.sort(listaDeCores);
		for(String cor:listaDeCores) {
			System.out.print("| "+cor+" ");	
		}	
		System.out.print("|\n");
	}

}
