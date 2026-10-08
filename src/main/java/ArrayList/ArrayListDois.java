package ArrayList;
import java.util.ArrayList;
import java.util.List;

//Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.
public class ArrayListDois {
    static void main() {
        ArrayList<String> lista = new ArrayList<>(List.of("Melao","uva","laranja","mamao"));

        System.out.println(lista.get(0));
        System.out.println(lista.get(3));
        System.out.println(lista.size());
    }
}
