package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
//tirar os repetidos. Imprima os dois e compare.

public class AtividadeTres {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("João");
        lista.add("Maria");
        lista.add("João"); // Repetido

        // no construtor do HashSet, os repetidos somem automaticamente
        HashSet<String> conjunto = new HashSet<>(lista);

        System.out.println("ArrayList (com repetição): " + lista);
        System.out.println("HashSet (sem repetição): " + conjunto);
    }
}