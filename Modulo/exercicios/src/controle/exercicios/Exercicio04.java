package controle.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {    
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int numeroInformadoPeloUsuario = entrada.nextInt();
		int quantidadeDeDivisores = 0;
		
		for(int i = 1; i <= numeroInformadoPeloUsuario; i++) {
			if(numeroInformadoPeloUsuario % i == 0) {
				quantidadeDeDivisores ++;
			}
		}
		
		if (quantidadeDeDivisores == 2) {
			System.out.println("Esse numero eh primo");
		} else {
			System.out.println("Esse numero nao eh primo");
		}
		
		entrada.close();
	}
}
