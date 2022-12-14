package controle.exercicios;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		 
		int ano = calendar.get(Calendar.YEAR);
		
		System.out.print("Ano atual: " + ano);
		boolean anoBissexto= Year.isLeap(ano);
		
		if (anoBissexto == true) {
			System.out.println(", estamos em um ano bissexto!");
		} else {
			System.out.println(", nao estamos em um ano bissexto!");
		}
	}
}
