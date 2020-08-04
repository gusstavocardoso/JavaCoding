package projectone;

public class Curso {
    String instrumento;
    String professor;

    public Curso(String instrumento, String professor){
        this.instrumento = instrumento;
        this.professor = professor;
    }

    public void exibirCurso() {
        System.out.println("Está matrículado no curso de " + instrumento);
        System.out.println("com o professor " + professor);
    }
}
