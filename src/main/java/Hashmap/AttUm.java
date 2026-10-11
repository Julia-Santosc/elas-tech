package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class AttUm {
    static void main() {
        Map<String, Integer> nomes = new HashMap<>();
        nomes.put("Joao", 24);
        nomes.put("Julia", 22);
        nomes.put("Sofia", 21);

//        System.out.println(nomes);

        System.out.println(nomes.get("Joao"));

    }

}

//julia: 22, joao victor: 24

//1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
//inteiro e depois use get para mostrar a idade de uma delas.