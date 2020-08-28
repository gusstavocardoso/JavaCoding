package poo.objeto;

public class ClassePessoa {
    String nome;
    String email;
    int ano_nascimento;

    // Construtor vazio
    public ClassePessoa(){

    }
    // Construtor com parâmetros
    public ClassePessoa(String nome, String email, int ano_nascimento){
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano_nascimento;
    }

    void imprime_informacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Ano de Nascimento: " + this.ano_nascimento);
    }
}

