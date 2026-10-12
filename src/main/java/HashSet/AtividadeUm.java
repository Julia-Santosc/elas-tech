package HashSet;

import java.util.HashSet;

//1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
//repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
//com o repetido.
public class AtividadeUm {

        public static void main(String[] args) {
            HashSet<String> nomes = new HashSet<>();
            nomes.add("Ana");
            nomes.add("Bruno");
            nomes.add("Carlos");
            nomes.add("Ana"); // Valor repetido!

            System.out.println("Conjunto: " + nomes);
            System.out.println("Tamanho: " + nomes.size());
        }
    }

