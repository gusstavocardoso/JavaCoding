package atributosemetodosestatico;

public class AtributoEstatico {
    public static void main(String[] args) {
        Conta c1 = new Conta("Van Helsing");
        System.out.println(c1.getCliente());
        System.out.println(c1.getNumero());

        Conta c2 = new Conta("Van Halen");
        System.out.println(c2.getCliente());
        System.out.println(c2.getNumero());
    }
}
