package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Ler num1
		System.out.print("Informe o Numero: ");
		double num1 = entrada.nextDouble();
		
		// Ler num2
		System.out.print("Informe o Numero: ");
		double num2 = entrada.nextDouble();
		
		// + - * / %
		System.out.print("Operadores para escolha: \n+ - * / %\nInforme a operacao: ");
		String operacao = entrada.next();
		//Lógica
		double resultado = "+".equals(operacao)? num1 + num2 : 0;
		resultado = "-".equals(operacao)? num1 - num2 : resultado;
		resultado = "*".equals(operacao)? num1 * num2 : resultado;
		resultado = "/".equals(operacao)? num1 / num2 : resultado;
		resultado = "%".equals(operacao)? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		entrada.close();
		
	}
	
}
