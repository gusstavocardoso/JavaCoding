package poo.heranca;

public class Principal {
    public static void main(String[] args) {
        Pessoa gustavo = new Pessoa("Gustavo Cardoso", 1986);
        System.out.println(gustavo.getNome());
        System.out.println(gustavo.getAnoNascimento());

        Aluno stevevai = new Aluno("Steve Vai", 1961,"123456");
        System.out.println(stevevai.getNome());
        System.out.println(stevevai.getRa());

        Professor joesatrinai = new Professor("Joe Satriani", 1955,"1234");
        System.out.println(joesatrinai.getNome());
        System.out.println(joesatrinai.getMatricula());
    }
}
