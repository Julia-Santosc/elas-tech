package ArrayList;

import java.util.ArrayList;
import java.util.List;

// Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.
public class ArrayListQuatro {
    static void main() {

        ArrayList<String> lista = new ArrayList<>(List.of("Salvador","Recife","Palmares","Rio de Janeiro"));
        lista.remove(0);
        System.out.println(lista);

    }
}