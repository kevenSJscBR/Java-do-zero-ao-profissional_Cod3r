package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa  = "vermelha";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o heian Godan");
		case "verde":
			System.out.println("Sei o heian Yodan");
		case "laranja":
			System.out.println("Sei o heian Sandan");
		case "vermelha":
			System.out.println("Sei o heian Nidan");
		case "amarela":
			System.out.println("Sei o heian Shodan");
		}
		System.out.println("fim");
		
		int idade = 3;
		
		switch(idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
	}

}
