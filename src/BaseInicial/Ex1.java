package BaseInicial;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário:\n");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono:\n");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("resultado:"+novoSalario);

	}

}
