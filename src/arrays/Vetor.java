package arrays;

public class Vetor {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        System.out.println("Tamanho do vetor: " + numeros.length);

        for(int i = 0; i <numeros.length; i++){
            numeros[i] = i + 3;
        }
        System.out.println(numeros[0]); // Primeiro elemento
        System.out.println(numeros[9]); // Último elemento

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int)Math.round(Math.random() * 10);
        }
        System.out.println(numeros[0]);
        System.out.println(numeros[9]);
    }
}
