package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float) 1.123456789; // explicita(cast)
		System.out.println(b);
		
		int c = 128; // explicita(cast)
		byte d =(byte) c;
		System.out.println(d);
		
		double e = 1.999999; // explicita(cast)
		int f = (int) e;
		System.out.println(f);
	}
}
