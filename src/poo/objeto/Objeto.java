package poo.objeto;

public class Objeto {
    public static void main(String[] args) {
        ClasseProduto produto1 = new ClasseProduto();

        produto1.nome = "Notebook";
        produto1.preco = 2.799f;
        produto1.desconto = 15.0f;

        System.out.println(produto1.nome);
        System.out.println("R$ " + produto1.preco);
        System.out.println(produto1.desconto + "%");

        ClassePessoa pessoa1 = new ClassePessoa();

        pessoa1.nome = "John Wick";
        pessoa1.email = "john@wick.com";
        pessoa1.ano_nascimento = 1977;

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("E-mail: " + pessoa1.email);
        System.out.println("Ano de Nascimento: " + pessoa1.ano_nascimento);

        pessoa1.imprime_informacoes();

        ClassePessoa pessoa2 = new ClassePessoa("Jimi Hendrix", "jimi@hendrix.com.br", 1942);
        pessoa2.imprime_informacoes();
    }
}
