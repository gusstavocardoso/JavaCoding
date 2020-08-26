package javalang;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class EscrevendoArquivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            PrintStream escrever = new PrintStream(new FileOutputStream("saída.txt", true));

            for (int i = 0 ; i < 5; i++){
                System.out.println("Escreva algo: ");
                String msg = teclado.nextLine();
                escrever.println(msg);
            }
            escrever.close();
        }catch (FileNotFoundException e){
            System.out.println("Não é possível criar o arquivo");
        }
        teclado.close();
    }
}
