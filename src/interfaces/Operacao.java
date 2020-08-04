package interfaces;

public class Operacao {
    public static void main(String[] args) {
        Ventilador vent = new Ventilador();

        System.out.println("A marca do ventilador é: " + vent.MARCA);

        vent.desligar();

        vent.ligar();

        vent.desligar();
    }
}
