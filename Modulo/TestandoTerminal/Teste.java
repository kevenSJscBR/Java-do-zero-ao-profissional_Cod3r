import java.util.Scanner;

public class Teste{

    public static void main(String[] x) {
        System.out.println("Olá terminal do computador!");
        
        Scanner entrada = new Scanner(System.in);

        String valor = entrada.nextLine();
        System.out.println("Valor é: " + valor);

        entrada.close();
    }
    
}