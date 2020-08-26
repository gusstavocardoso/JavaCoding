package fundamentos;

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
        teste();
        somar(4,6);

        Teste test = new Teste();
        System.out.println(test.somando(3,3));
        System.out.println(test.helloJava());
        test.somando(3,6);

        Estatica.imprimir();

        int a = 9;
        for (a = 0; a < 10; a++){
            System.out.println("Testando For");
        }
    }

    public static void teste() {
        System.out.println("testando");
    }

    public static void somar(int a, int b){
        System.out.println((a + b));
    }
}

class Teste{
    public int somando(int c, int d){
       return c + d;
    }

    public String helloJava(){
        return "Hello Java!";
    }
}

class Estatica{
    public static void imprimir(){
        System.out.println("Método sem instância");
    }
}
