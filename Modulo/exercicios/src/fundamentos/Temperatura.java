package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		final double ajuste = 32;
		final double multiplicador = 5/9.0;
		double temperaturaEmF = 86;
		
		double temperaturaEmC = (temperaturaEmF - ajuste) * multiplicador;
		
		System.out.println("A temperatura em celsius é: " +temperaturaEmC + "ºC");
			
	}
}
