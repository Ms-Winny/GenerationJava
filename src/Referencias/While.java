package Referencias;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int num, contImpar = 0, somaPar = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro");
		num = leia.nextInt();
		
		while(num != 0) {
			
			if(num %2 == 0) {
				somaPar += num;
			} else {
				contImpar++;
			}
			
			System.out.println("Entre com um número inteiro");
			num = leia.nextInt();
		}
		
		System.out.println("Somatório dos números pares: "+somaPar);
		System.out.println("Quantidade números ímpares: "+contImpar);

	}

}
