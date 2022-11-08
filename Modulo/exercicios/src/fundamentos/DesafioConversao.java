package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner digitado = new Scanner(System.in);
		
		System.out.print("Qual seu salario: ");
		String valor1 = digitado.next().replace(",", ".");
		
		System.out.print("Qual seu segundo salario: ");
		String valor2 = digitado.next().replace(",", ".");
		
		System.out.print("Qual seu terceiro salario: ");
		String valor3 = digitado.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3)/3;
		System.out.println("A media dos salarios: " + media);
		
		digitado.close();
	}
}
