package ArrayList;
import java.util.ArrayList;
import java.util.List;

// - Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.
public class ArrayListUm {
    static void main() {

        ArrayList<String>lista = new ArrayList<>();

        lista.addAll(List.of("Bia", "Maria", "Sofia"));
        System.out.println(lista);


    }
}
