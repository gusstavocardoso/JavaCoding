package fundamentos;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int a, b, c;

        a = 10;
        b = 8;
        c = 10;

        boolean maior = a > b;
        System.out.println(maior);

        boolean menor = b > a;
        System.out.println(menor);

        boolean igual = a == c;
        System.out.println(igual);

        boolean diferente = a != c;
        System.out.println(diferente);
    }
}
