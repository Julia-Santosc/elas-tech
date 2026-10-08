package ArrayList;

import java.util.ArrayList;
import java.util.List;

//- Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista)
public class ArrayListCinco {
    static void main() {

        ArrayList<String> lista = new ArrayList<String>(List.of("Ana","Maria","Bianca","Julia","Joao","Iris"));
        for (int i = 0; i <5 ; i++) {
            System.out.println( i + " : " + lista.get(i));

        }
    }
}