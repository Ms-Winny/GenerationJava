package Collections;

import java.util.*;

public class Ex2ArrayList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList <Integer> listaDeNumeros = new ArrayList<Integer>();
		int numeroAleatorio;
		
		for(int i = 0; i < 10; i++) {
			Random random = new Random(); 
			numeroAleatorio = random.nextInt(10);
			listaDeNumeros.add(numeroAleatorio);
		}
		
		System.out.println("Digite um número:");
		numeroAleatorio = leia.nextInt();
		
		if(listaDeNumeros.contains(numeroAleatorio)) {
			System.out.println("O número "+numeroAleatorio+" se encontra na posição: "+listaDeNumeros.indexOf(numeroAleatorio));
		} else {
			System.out.println("O número "+numeroAleatorio+" não foi encontrado na lista!");
		}
	}

}
