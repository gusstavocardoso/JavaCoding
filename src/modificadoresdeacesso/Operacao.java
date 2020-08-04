package modificadoresdeacesso;

public class Operacao {
    public static void main(String[] args) {
        Cliente malmsteen = new Cliente("Yngwie Malmsteen", "Street String, 78");
        Cliente satriani = new Cliente("Joe Satriani", "Street Legato, 1047");

        Conta conta_malmsteen = new Conta(1, 100.0f, 200.0f, malmsteen);
        Conta conta_satriani = new Conta(2, 300.0f, 500.0f, satriani);

        System.out.println("Saldo do Malmsteen ante do saque: " + conta_malmsteen.getSaldo());
        System.out.println("Saldo do Satriani: " + conta_satriani.getSaldo());

        conta_malmsteen.sacar(150);
        System.out.println("Saldo do Malmsteen depois do saque: " + conta_malmsteen.getSaldo());
    }
}
