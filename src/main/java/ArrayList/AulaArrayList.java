package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AulaArrayList {
    static void main() {
        /*.add();
        .get();
        .size();
        .contains();
        .indexOf();
        .remove();
        .set();
        .isEmpty();
        .addAll(List.of());*/
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(10);
        lista.add(100);
        lista.add(1000);
        System.out.println(lista);

        lista.add(2, 77);
        lista.addAll(List.of(1, 2, 35, 6, 765, 234, 9));

        System.out.println(lista);
        lista.remove(1); // Remove a posição da lista.
        System.out.println(lista);
        System.out.println(lista.get(2));

        lista.set(0,98); //Trocando a posição, primeiro coloco a posição e depois o numero que quero trocar.
        System.out.println(lista);
        System.out.println(lista.size()); // Usamos pra informar o tamanho da lista

        System.out.println(lista.contains(98)); // Verifica se contem um item na lista (true, false).
        System.out.println(lista.indexOf(98)); // Mostrar em qual posição ta o valor que eu coloquei.
        System.out.println(lista.isEmpty());
    }
}
