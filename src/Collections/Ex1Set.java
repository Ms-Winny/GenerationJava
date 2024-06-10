package Collections;

import java.util.*;

public class Ex1Set {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		
		Set<Integer> listaDeNumeros = new HashSet<Integer>();
		
		System.out.println("Vamos criar uma lista com 10 números não repetidos.");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número:");
			numero = leia.nextInt();
			listaDeNumeros.add(numero);
		}
		
		System.out.println("\nNúmeros dentro do set:");
		Iterator<Integer> iNumeros = listaDeNumeros.iterator();
		
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

	}

}
