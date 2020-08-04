package fundamentos;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        String nome;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é seu nome?");
        nome = entrada.nextLine();
        System.out.println("Meu nome é " + nome);
    }
}
