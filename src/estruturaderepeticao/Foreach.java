package estruturaderepeticao;

public class Foreach {
    public static void main(String[] args) {
        String nome = "Geek University";

        for(char letra: nome.toCharArray()){
            System.out.println(letra);
        }
    }
}