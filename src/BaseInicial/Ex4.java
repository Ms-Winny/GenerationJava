package BaseInicial;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, diff;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o numero 1:\n");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o numero 2:\n");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o numero 3:\n");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o numero 4:\n");
		n4 = leia.nextFloat();
		
		diff = (n1 * n2) - (n3 * n4);
		
		System.out.println("resultado:"+diff);
	}

}
