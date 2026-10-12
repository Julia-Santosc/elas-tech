package ArrayDeque;

import java.util.ArrayDeque;
//1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila
//e quantas pessoas tem.
public class AtividadeUm {
    public static void main(String[] args) {
        // fila vazia
        ArrayDeque<String> fila = new ArrayDeque<>();

        fila.add("Maria");
        fila.add("João");
        fila.add("Julia");

        // fila e tamanho (quantas pessoas tem)
        System.out.println("Fila: " + fila);
        System.out.println("Pessoas na fila: " + fila.size());
    }
}

