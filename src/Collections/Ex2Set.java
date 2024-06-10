package Collections;

import java.util.*;

public class Ex2Set {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> listaDeNumeros = new HashSet<Integer>();
		Random random = new Random();
		int numero;
		
		for(int i = 0; i < 10; i++ ) {
			numero = random.nextInt(15); 
			listaDeNumeros.add(numero);
		}
		
		System.out.println("Digite um número:");
		numero = leia.nextInt();
		if(listaDeNumeros.contains(numero)) {
			System.out.println("Número "+numero+" encontrado na lista!");
		} else {
			System.out.println("Número "+numero+" não encontrado na lista!");
		}
	}

}
