package controle.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double primeiraNota = entrada.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double segundaNota = entrada.nextDouble();
		
		double mediaDasNotas = (primeiraNota + segundaNota) / 2;
		System.out.print("A media e: " + mediaDasNotas);
		if (mediaDasNotas <= 4.0) {
			System.out.println(", esta reprovado!");
		} else if (mediaDasNotas <= 7.0) {
			System.out.println(", esta em recuperacao!");
		} else if (mediaDasNotas <= 10.0) {
			System.out.println(", voce foi aprovado!");
		} else {
			System.out.println(", parece que tem algo errado com as notas informadas");
		}
		
		
		entrada.close();
	}
}
