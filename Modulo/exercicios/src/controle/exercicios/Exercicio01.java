package controle.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um numero[0-10]: ");
		int interacaoDoUsuario = entrada.nextInt();
		
		if (interacaoDoUsuario > -1 && interacaoDoUsuario < 11) {
			System.out.print("Este esta entre 0 e 10");
			if (interacaoDoUsuario % 2 == 0) {
				System.out.print(", e este numero e par!");
			}else {
				System.out.print(", e este numero e impar!");
			}
			
		} else {
			System.out.println("Numero nao e valido!");
		}
		
		
		entrada.close();
		
	}
}
