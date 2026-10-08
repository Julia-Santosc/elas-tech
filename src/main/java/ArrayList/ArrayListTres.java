package ArrayList;

import java.util.ArrayList;
import java.util.List;

//Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.
public class ArrayListTres {
    static void main() {

        ArrayList<String> lista = new ArrayList<>(List.of("Bia","Sofia","Maria","Ana"));
        System.out.println(lista);
        lista.set(1,"Joao");
        System.out.println(lista);

    }
}
