package poo.objeto;

public class ClasseProduto {
    String nome;
    float preco;
    float desconto;

    void aumentar_preco(float valor){
        this.preco = this.preco + valor;
    }
}
