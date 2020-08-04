package projectone;

public class Aluno {
    String nome;
    int idade;
    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public void exibirMatricula() {
        System.out.println("Aluno: " + nome + "Matrícula : " + getMatricula());
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
}
