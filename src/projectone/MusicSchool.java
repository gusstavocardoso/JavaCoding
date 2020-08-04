package projectone;

public class MusicSchool {
    public static void main(String[] args) {
        Aluno gustavo = new Aluno("Gustavo ", 34, 01);
        Curso guitarra = new Curso("Guitarra", "Edu Ardanuy");

        gustavo.exibirMatricula();
        gustavo.setMatricula(02);
        gustavo.getMatricula();
        gustavo.exibirMatricula();
        guitarra.exibirCurso();
    }
}
