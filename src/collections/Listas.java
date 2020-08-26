package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();

        nomes.add("Sonya");
        nomes.add("Kano");
        nomes.add("Liu Kang");
        nomes.add("Scorpion");
        nomes.add("Reptile");

        Collections.sort(nomes);

        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}
