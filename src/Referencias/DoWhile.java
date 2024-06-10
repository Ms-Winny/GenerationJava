package Referencias;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int num, x = 1, resultado;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que você quer saber a tabuada: ");
		num = leia.nextInt();
		
		do {
			resultado = num * x;
			System.out.println(x+" x "+num+" = "+resultado);
			x++;
			
		} while (x <= 10);

	}

}
