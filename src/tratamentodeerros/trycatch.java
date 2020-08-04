package tratamentodeerros;

import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro número para divisão: ");
        int num1 = teclado.nextInt();

        System.out.println("Informe o segundo número para divisão: ");
        int num2 = teclado.nextInt();

        try{
            System.out.println("A divisão de " + num1 + " por " + num2 + " é " + num1 / num2);
        }catch (ArithmeticException e){
            System.out.println("Não é possível dividir " + num1 + " por " + num2);
        }
        finally {
            System.out.println("O Finally é um complemento do Try/Catch");
        }
        teclado.close();
    }
}
