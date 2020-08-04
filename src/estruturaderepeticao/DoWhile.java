package estruturaderepeticao;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int idade;
        String nome;

        Scanner teclado = new Scanner(System.in);

        // Executa o bloco
        do{
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.println("Informe sua idade:");
            //idade = teclado.nextInt(); //Bug
            idade = Integer.parseInt(teclado.nextLine());

            if (idade > 0) {
                System.out.println(nome + " tem " + idade + " anos");
            }
        // Checa o bloco
        }while (idade > 0);

        teclado.close();
    }
}
