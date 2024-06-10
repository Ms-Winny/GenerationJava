package BaseInicial;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		float salarioBruto, salarioLiquido, hExtras, adcNoturno, descontos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário bruto:\n");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o o valor das horas extras:\n");
		hExtras = leia.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno:\n");
		adcNoturno = leia.nextFloat();
		
		System.out.println("Digite o valor total dos descontos:\n");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adcNoturno + (hExtras * 5) - descontos;
		
		System.out.println("O salário líquido é:"+salarioLiquido);

	}

}
