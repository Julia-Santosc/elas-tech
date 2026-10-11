package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class AttCinco {
    static void main() {
        Map<String, Double> alunas = new HashMap<>();

        alunas.put("Julia", 8.5);
        alunas.put("Joelma", 6.0);
        alunas.put("Joice", 9.5);

        System.out.println(alunas);
        System.out.println(alunas.size());

        alunas.remove("Joelma");

        System.out.println(alunas);
        System.out.println(alunas.size());

    }

}


//5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
//Remova uma delas e imprima de novo.