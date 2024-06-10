package EstruturaDados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//import java.util.*; Serve para importar todos da classe util

public class Colecao1 {

	public static void main(String[] args) {
		
		List <Integer> ListaDeInteiros = new ArrayList<Integer>();
		
		ListaDeInteiros.add(3);
		ListaDeInteiros.add(6);
		ListaDeInteiros.add(81);
		ListaDeInteiros.add(9);
		ListaDeInteiros.add(75);
		ListaDeInteiros.add(14);
		
		//Foreach, para cada...
		for(Integer ListaElementos:ListaDeInteiros) {
			System.out.print(ListaElementos+" ");
		}
		System.out.println(); //Esvaziar o cache
		ListaDeInteiros.remove(0); //Remove o item na posição 0
		
		int primeiroElemento = ListaDeInteiros.get(0); //Pega o atual primeiro elemento da lista e joga na variavel
		System.out.println("O elemento selecionado foi "+primeiroElemento);
		System.out.println(); //Esvaziar o cache
		
		for(int i = 0; i < ListaDeInteiros.size(); i++) {
			System.out.println("\nElemento "+ListaDeInteiros.get(i));
		}
		
		Collections.sort(ListaDeInteiros); //Serve para reordenar os elementos em ordem crescente
		
		System.out.println("Lista depois de ordenada: ");
		System.out.println(ListaDeInteiros);
		System.out.println(); //Esvaziar o cache
		
		//===================================================================================================================
		
		Set<Integer> meuSet = new HashSet<Integer>();
		//Set não aceita elementos duplicados, diferente do list
		
		meuSet.add(57);
		meuSet.add(78);
		meuSet.add(99);
		meuSet.add(34);
		meuSet.add(65);
		meuSet.add(86);
		
		meuSet.addAll(ListaDeInteiros); // Adicionar todos os elementos da lista para o set
		
	}

}
