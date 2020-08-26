package fundamentos;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a, b;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        a = input.nextInt();

        System.out.println("Digite o segundo número");
        b = input.nextInt();

        int resultadoSoma = a + b;
        int resultadoMultiplicacao = a * b;
        int resultadoSubtracao = a - b;
        int resultadoDivisao = a / b;

        System.out.println("A soma de a + b é: " + resultadoSoma);
        System.out.println("A multiplicação de a * b é: " + resultadoMultiplicacao);
        System.out.println("A subtração de a - b é: " + resultadoSubtracao);
        System.out.println("A divisão de a / b é: " + resultadoDivisao);

        for (resultadoSoma = 0; resultadoSoma < 10; resultadoSoma++){
            System.out.println("Isso é um For");
        }
    }
}
