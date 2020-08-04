package estruturaderepeticao;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int idade = 1;
        String nome;

        Scanner teclado = new Scanner(System.in);
        // Checa antes de executar o bloco
        while (idade > 0){
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.println("Informe sua idade:");
            //idade = teclado.nextInt(); //Bug
            idade = Integer.parseInt(teclado.nextLine());

            if (idade > 0) {
                System.out.println(nome + " tem " + idade + " anos");
            }
        }
        teclado.close();
    }
}


