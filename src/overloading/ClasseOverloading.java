package overloading;

public class ClasseOverloading {
    public void mensagem(){
        System.out.println("Isto é uma mensagem!");
    }

    // Sobrecarga - Deve haver parâmetro e deve ser diferente caso já tenha
    public void mensagem(String msg){
        System.out.println(msg);
    }
}
