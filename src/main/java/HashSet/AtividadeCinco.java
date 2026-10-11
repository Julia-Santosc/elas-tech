package HashSet;

import java.util.HashSet;

//5. Crie um HashSet com três frutas e percorra ele com for,
//imprimindo uma por linha.

public class AtividadeCinco {
    public static void main(String[] args) {
        HashSet<String> frutas = new HashSet<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        // O HashSet nao guarda posiçao (tipo 0, 1, 2)não dá pra usar frutas.get(0)).
        // Usamos o for-each para percorrer todos os elementos:
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }

}
